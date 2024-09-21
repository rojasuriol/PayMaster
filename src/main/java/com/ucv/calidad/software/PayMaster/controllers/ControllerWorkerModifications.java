package com.ucv.calidad.software.PayMaster.controllers;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerListOutputDto;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerOutputDto;
import com.ucv.calidad.software.PayMaster.worker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController("ControllerWorkerModifications")
@RequestMapping("/v1")
public class ControllerWorkerModifications {
    private final WorkerService workerService;

    @Autowired
    public ControllerWorkerModifications(WorkerService workerService) {
        this.workerService = workerService;
    }
    @PostMapping(value = "/Workers", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED) // 200 OK
    public WorkerOutputDto createproduct(@RequestBody WorkerDTO workerDTO) {
        return workerService.createWorker(workerDTO);
    }

    @PutMapping(value = "/Workers/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK) // 200 OK
    public WorkerOutputDto updateWorker(@RequestBody WorkerDTO workerDTO, @PathVariable Long id) {
        return workerService.updateWorker(workerDTO, id);
    }

}
