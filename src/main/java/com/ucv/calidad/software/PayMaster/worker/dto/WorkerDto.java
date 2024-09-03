package com.ucv.calidad.software.PayMaster.worker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerDto {
    @Id
    @JsonProperty("id_worker")
    private Long idWorker;

    @JsonProperty("first_name_worker")
    private String firstName;

    @JsonProperty("last_name_worker")
    private String lastName;

    @JsonProperty("dni_worker")
    private String dni;

    @JsonProperty("estado_worker")
    private String estado;

    @JsonProperty("date_birth_worker")
    private LocalDate dateOfBirth;

    @JsonProperty("gender_worker")
    private String gender;

    @JsonProperty("contact_number_worker")
    private String contactNumber;

    @JsonProperty("email_worker")
    private String email;

    @JsonProperty("registration_day")
    private LocalDate registrationDay;

    @JsonProperty("creation_by")
    private String createdBy;

    @JsonProperty("modification_day")
    private LocalDate modificationDay;

    @JsonProperty("modification_by")
    private String modificationBy;

    @JsonProperty("elimination_day")
    private LocalDate eliminationDay;

    @JsonProperty("elimination_by")
    private String EliminationBy;
}
