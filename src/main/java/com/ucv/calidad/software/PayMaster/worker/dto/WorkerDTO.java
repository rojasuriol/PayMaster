package com.ucv.calidad.software.PayMaster.worker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    private int idWorker;
    private String firstName;
    private String lastName;
    private String dni;
    private LocalDate dateOfBirth;
    private String gender;
    private String nationality ;
    private String contactNumber;
    private String email;
    private String address;
    private LocalDate registrationDay;
    private String createdBy;
    private LocalDate modificationDay;
    private String modifiedBy;
    private LocalDate deletedDay;
    private String deletedBy;

}
