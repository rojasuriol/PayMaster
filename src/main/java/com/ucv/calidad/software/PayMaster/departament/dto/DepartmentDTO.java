package com.ucv.calidad.software.PayMaster.departament.dto;

import com.ucv.calidad.software.PayMaster.worker.dto.WorkerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    @Id
    private int idDepartment;
    private String name;
    private String description;
    private Set<WorkerDTO> workers;
}
