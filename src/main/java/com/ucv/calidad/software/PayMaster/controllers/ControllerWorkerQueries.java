package com.ucv.calidad.software.PayMaster.controllers;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerListOutputDto;
import com.ucv.calidad.software.PayMaster.worker.dto.WorkerOutputDto;
import com.ucv.calidad.software.PayMaster.worker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController("ControllerWorkerQueries")
@RequestMapping("/v1")
public class ControllerWorkerQueries {
    private final WorkerService workerService;

    @Autowired
    public ControllerWorkerQueries(WorkerService workerService) {
        this.workerService = workerService;
    }
    @GetMapping(value = "/Workers", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK) // 200 OK
    public WorkerListOutputDto getAllWorkers() {
        return workerService.getAllWorkers();
    }
    @GetMapping(value = "/Workers/{idWorker}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.PARTIAL_CONTENT) // 206 OK
    public WorkerOutputDto getWorkersById(@PathVariable Long idWorker) {
        return workerService.getWorkerById(idWorker);
    }
}
