package com.ucv.calidad.software.PayMaster.worker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ucv.calidad.software.PayMaster.departament.dto.DepartmentDTO;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerDTO {
    @Id
    private Long idWorker;
    private String firstName;
    private String lastName;
    private String dni;
    private String status;
    private LocalDate dateOfBirth;
    private String gender;
    private String contactNumber;
    private String email;
    private LocalDate registrationDay;
    private String createdBy;
    private LocalDate modificationDay;
    private String modifiedBy;
    private LocalDate deletedDay;
    private String deletedBy;
    private DepartmentDTO department;
}
