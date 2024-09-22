package com.ucv.calidad.software.PayMaster.worker.service;

import com.ucv.calidad.software.PayMaster.departament.Department;
import com.ucv.calidad.software.PayMaster.departament.dto.DepartmentDTO;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerListOutputDto;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerOutputDto;
import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import com.ucv.calidad.software.PayMaster.worker.mappers.GetWorkerOutputMapper;
import com.ucv.calidad.software.PayMaster.worker.mappers.PostWorkerOutputMapper;
import com.ucv.calidad.software.PayMaster.worker.mappers.PutWorkerOutputMapper;
import com.ucv.calidad.software.PayMaster.worker.repository.WorkerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service("workerService")
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    @Qualifier("GetWorkerOutputMapper")
    private GetWorkerOutputMapper getMapper;

    @Autowired
    @Qualifier("PostWorkerOutputMapper")
    private PostWorkerOutputMapper postMapper;

    @Autowired
    @Qualifier("PutWorkerOutputMapper")
    private PutWorkerOutputMapper putMapper;

    public WorkerListOutputDto getAllWorkers() {

        List<Worker> workers = workerRepository.findAll();

        List<WorkerDTO> workerList = workers.stream().map(getMapper::toDTO).collect(Collectors.toList());

        WorkerListOutputDto outputDto = new WorkerListOutputDto();
        outputDto.setWorkers(workerList);

        return outputDto;
    }

    public WorkerOutputDto getWorkerById(Long idWorker) {
        Worker worker = workerRepository.findById(idWorker)
                .orElseThrow(() -> new RuntimeException("Worker not found with id " + idWorker));
        if (worker != null) {
            WorkerDTO workerDTO = getMapper.toDTO(worker);
            return new WorkerOutputDto(workerDTO);
        } else {
            return new WorkerOutputDto(null);
        }
    }

    public WorkerOutputDto createWorker(WorkerDTO workerDTO) {
        Worker worker = new Worker();
        worker.setFirstName(workerDTO.getFirstName());
        worker.setLastName(workerDTO.getLastName());
        worker.setDni(workerDTO.getDni());
        worker.setDateOfBirth(workerDTO.getDateOfBirth());
        worker.setGender(workerDTO.getGender());
        worker.setContactNumber(workerDTO.getContactNumber());
        worker.setEmail(workerDTO.getEmail());
        worker.setDepartment(toDepartment(workerDTO.getDepartment()));
        worker.setRegistrationDay(LocalDate.now());
        worker.setCreatedBy(workerDTO.getCreatedBy());
        Worker createWorker = workerRepository.save(worker);
        WorkerDTO workerDTOMapper = postMapper.toDTO(createWorker);
        return new WorkerOutputDto(workerDTOMapper);
    }

    public WorkerOutputDto updateWorker(WorkerDTO workerDTO, Long id) {
        Worker worker = workerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Worker not found with id: " + id));

        worker.setFirstName(workerDTO.getFirstName());
        worker.setLastName(workerDTO.getLastName());
        worker.setDni(workerDTO.getDni());
        worker.setDateOfBirth(workerDTO.getDateOfBirth());
        worker.setGender(workerDTO.getGender());
        worker.setContactNumber(workerDTO.getContactNumber());
        worker.setEmail(workerDTO.getEmail());
        worker.setDepartment(toDepartment(workerDTO.getDepartment()));  // Asignar departamento actualizado
        worker.setModificationDay(LocalDate.now());
        worker.setModifiedBy("jean");  // Puedes cambiarlo por el usuario autenticado

        // Guardar el trabajador actualizado
        Worker updatedWorker = workerRepository.save(worker);

        // Mapear el trabajador actualizado a DTO
        WorkerDTO workerDTOMapper = putMapper.toDTO(updatedWorker);

        // Retornar el DTO de salida
        return new WorkerOutputDto(workerDTOMapper);
    }


//esto es develop

    private Department toDepartment(DepartmentDTO departmentDTO) {
        if (departmentDTO == null) {
            return null;
        }
        Department department = new Department();
        department.setIdDepartment(departmentDTO.getIdDepartment());
        department.setName(departmentDTO.getName());
        return department;
    }
}
