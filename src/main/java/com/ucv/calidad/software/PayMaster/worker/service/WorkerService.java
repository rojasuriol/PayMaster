package com.ucv.calidad.software.PayMaster.worker.service;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerListOutputDto;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerOutputDto;

public interface WorkerService {

    WorkerListOutputDto getAllWorkers();
    WorkerOutputDto getWorkerById(Long idWorker);
    WorkerOutputDto createWorker(WorkerDTO workerDTO);
    WorkerOutputDto updateWorker(WorkerDTO workerDTO, Long id);
    void deleteWorker(Long id);
}
