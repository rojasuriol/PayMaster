package com.ucv.calidad.software.PayMaster.worker.mappers;


import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component("GetWorkerOutputMapper")
public class GetWorkerOutputMapper {

    public Worker toEntity(WorkerDTO workerDto ) {
        Worker worker = new Worker();
        worker.setIdWorker(workerDto.getIdWorker());
        worker.setDni(workerDto.getDni());
        worker.setFirstName(workerDto.getFirstName());
        worker.setLastName(workerDto.getLastName());
        worker.setNationality(workerDto.getNationality());
        worker.setDateOfBirth(workerDto.getDateOfBirth());
        worker.setGender(workerDto.getGender());
        worker.setContactNumber(workerDto.getContactNumber());
        worker.setEmail(workerDto.getEmail());
        worker.setAddress(workerDto.getAddress());
        worker.setRegistrationDay(workerDto.getRegistrationDay());
        worker.setCreatedBy(workerDto.getCreatedBy());
        worker.setModificationDay(workerDto.getModificationDay());
        worker.setModifiedBy(workerDto.getModifiedBy());
        worker.setDeletedDay(workerDto.getDeletedDay());
        worker.setDeletedBy(workerDto.getDeletedBy());
        return worker;
    }

    public WorkerDTO toDTO(Worker worker) {
        WorkerDTO dto = new WorkerDTO();
        dto.setIdWorker(worker.getIdWorker());
        dto.setDni(worker.getDni());
        dto.setFirstName(worker.getFirstName());
        dto.setLastName(worker.getLastName());
        dto.setNationality(worker.getNationality());
        dto.setDateOfBirth(worker.getDateOfBirth());
        dto.setGender(worker.getGender());
        dto.setContactNumber(worker.getContactNumber());
        dto.setEmail(worker.getEmail());
        dto.setAddress(worker.getAddress());
        dto.setRegistrationDay(worker.getRegistrationDay());
        dto.setCreatedBy(worker.getCreatedBy());
        dto.setModificationDay(worker.getModificationDay());
        dto.setModifiedBy(worker.getModifiedBy());
        dto.setDeletedDay(worker.getDeletedDay());
        dto.setDeletedBy(worker.getDeletedBy());
        return dto;
    }

    public List<WorkerDTO> entitiesListToDto (List<Worker> entities){
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }



}
