package com.ucv.calidad.software.PayMaster.departament.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentListOutputDto {
    List<DepartmentDTO> departments;


}
