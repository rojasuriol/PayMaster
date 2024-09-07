package com.ucv.calidad.software.PayMaster.worker.service;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerListOutputDto;
import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import com.ucv.calidad.software.PayMaster.worker.mappers.GetWorkerOutputMapper;
import com.ucv.calidad.software.PayMaster.worker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("workerService")
public class WorkerServiceImpl implements WorkerService{

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    @Qualifier("GetWorkerOutputMapper")
    private GetWorkerOutputMapper getMapper;

    public WorkerListOutputDto getAllWorkers() {

        List<Worker> products = workerRepository.findAll();


        List<WorkerDTO> workerDtos = products.stream().map(getMapper::toDTO).collect(Collectors.toList());

        WorkerListOutputDto outputDto = new WorkerListOutputDto();
        outputDto.setWorkers(workerDtos);


        return outputDto;

    }
}
