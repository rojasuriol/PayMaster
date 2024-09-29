package com.ucv.calidad.software.PayMaster.worker.mappers;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component("PostWorkerOutputMapper")
public class PostWorkerOutputMapper {

    public Worker toEntity(WorkerDTO workerDto ) {
        Worker worker = new Worker();
        worker.setIdWorker(workerDto.getIdWorker());
        worker.setFirstName(workerDto.getFirstName());
        worker.setLastName(workerDto.getLastName());
        worker.setDni(workerDto.getDni());
        worker.setNationality(workerDto.getNationality());
        worker.setDateOfBirth(workerDto.getDateOfBirth());
        worker.setGender(workerDto.getGender());
        worker.setContactNumber(workerDto.getContactNumber());
        worker.setEmail(workerDto.getEmail());
        worker.setAddress(workerDto.getAddress());
        worker.setRegistrationDay(workerDto.getRegistrationDay());
        worker.setCreatedBy(workerDto.getCreatedBy());
        return worker;
    }

    public WorkerDTO toDTO(Worker worker) {
        WorkerDTO dto = new WorkerDTO();
        dto.setIdWorker(worker.getIdWorker());
        dto.setFirstName(worker.getFirstName());
        dto.setLastName(worker.getLastName());
        dto.setDni(worker.getDni());
        dto.setNationality(worker.getNationality());
        dto.setDateOfBirth(worker.getDateOfBirth());
        dto.setGender(worker.getGender());
        dto.setContactNumber(worker.getContactNumber());
        dto.setEmail(worker.getEmail());
        dto.setAddress(worker.getAddress());
        dto.setRegistrationDay(worker.getRegistrationDay());
        dto.setCreatedBy(worker.getCreatedBy());
        return dto;
    }
    public List<WorkerDTO> entitiesListToDto (List<Worker> entities){
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
