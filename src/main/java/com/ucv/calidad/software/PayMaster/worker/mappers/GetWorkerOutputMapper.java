package com.ucv.calidad.software.PayMaster.worker.mappers;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDto;
import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component("GetWorkerOutputMapper")
public class GetWorkerOutputMapper {

    public Worker toEntity(WorkerDto workerDto ) {
        Worker worker = new Worker();
        worker.setIdWorker(workerDto.getIdWorker());
        worker.setDni(workerDto.getDni());
        worker.setFirstName(workerDto.getFirstName());
        worker.setLastName(workerDto.getLastName());
        worker.setEstado(workerDto.getEstado());
        worker.setDateOfBirth(workerDto.getDateOfBirth());
        worker.setGender(workerDto.getGender());
        worker.setContactNumber(workerDto.getContactNumber());
        worker.setEmail(workerDto.getEmail());
        worker.setRegistrationDay(workerDto.getRegistrationDay());
        worker.setCreatedBy(workerDto.getCreatedBy());
        worker.setModificationDay(workerDto.getModificationDay());
        worker.setModificationBy(workerDto.getModificationBy());
        worker.setEliminationDay(workerDto.getEliminationDay());
        worker.setEliminationBy(workerDto.getEliminationBy());
        return worker;
    }

    public WorkerDto toDTO(Worker worker) {
        WorkerDto dto = new WorkerDto();
        dto.setIdWorker(worker.getIdWorker());
        dto.setDni(worker.getDni());
        dto.setFirstName(worker.getFirstName());
        dto.setLastName(worker.getLastName());
        dto.setEstado(worker.getEstado());
        dto.setDateOfBirth(worker.getDateOfBirth());
        dto.setGender(worker.getGender());
        dto.setContactNumber(worker.getContactNumber());
        dto.setEmail(worker.getEmail());
        dto.setRegistrationDay(worker.getRegistrationDay());
        dto.setCreatedBy(worker.getCreatedBy());
        dto.setModificationDay(worker.getModificationDay());
        dto.setModificationBy(worker.getModificationBy());
        dto.setEliminationDay(worker.getEliminationDay());
        dto.setEliminationBy(worker.getEliminationBy());
        return dto;
    }
    public List<WorkerDto> entitiesListToDto (List<Worker> entities){
        return entities.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
