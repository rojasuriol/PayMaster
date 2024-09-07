package com.ucv.calidad.software.PayMaster.departament.dto;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private Long idDepartment;
    private String name;
    private String description;
    private Set<WorkerDTO> workers;
}
