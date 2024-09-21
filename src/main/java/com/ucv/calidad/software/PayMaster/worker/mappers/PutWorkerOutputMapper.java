package com.ucv.calidad.software.PayMaster.worker.mappers;
import com.ucv.calidad.software.PayMaster.departament.Department;
import com.ucv.calidad.software.PayMaster.departament.dto.DepartmentDTO;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component("PutWorkerOutputMapper")
public class PutWorkerOutputMapper {

    public Worker toEntity(WorkerDTO workerDto ) {
        Worker worker = new Worker();
        worker.setIdWorker(workerDto.getIdWorker());
        worker.setDni(workerDto.getDni());
        worker.setFirstName(workerDto.getFirstName());
        worker.setLastName(workerDto.getLastName());
        worker.setDateOfBirth(workerDto.getDateOfBirth());
        worker.setGender(workerDto.getGender());
        worker.setContactNumber(workerDto.getContactNumber());
        worker.setEmail(workerDto.getEmail());
        worker.setRegistrationDay(workerDto.getRegistrationDay());
        worker.setCreatedBy(workerDto.getCreatedBy());
        worker.setModificationDay(workerDto.getModificationDay());
        worker.setModifiedBy(workerDto.getModifiedBy());
        return worker;
    }

    public WorkerDTO toDTO(Worker worker) {
        WorkerDTO dto = new WorkerDTO();
        dto.setIdWorker(worker.getIdWorker());
        dto.setDni(worker.getDni());
        dto.setFirstName(worker.getFirstName());
        dto.setLastName(worker.getLastName());
        dto.setDateOfBirth(worker.getDateOfBirth());
        dto.setGender(worker.getGender());
        dto.setContactNumber(worker.getContactNumber());
        dto.setEmail(worker.getEmail());
        dto.setDepartment(toDepartmentDTO(worker.getDepartment()));
        dto.setRegistrationDay(worker.getRegistrationDay());
        dto.setCreatedBy(worker.getCreatedBy());
        dto.setModificationDay(worker.getModificationDay());
        dto.setModifiedBy(worker.getModifiedBy());
        return dto;
    }
    private DepartmentDTO toDepartmentDTO(Department department) {
        if (department == null) {
            return null;
        }
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setIdDepartment(department.getIdDepartment());
        departmentDTO.setName(department.getName());


        return departmentDTO;
    }
    public List<WorkerDTO> entitiesListToDto (List<Worker> entities){
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
