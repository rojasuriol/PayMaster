package com.ucv.calidad.software.PayMaster.worker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerListOutputDto {
    List<WorkerDto> workers;


}
