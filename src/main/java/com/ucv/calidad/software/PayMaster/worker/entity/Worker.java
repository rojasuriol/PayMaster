package com.ucv.calidad.software.PayMaster.worker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "WORKER")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WORKER_SEQ")
    @SequenceGenerator(name = "WORKER_SEQ", sequenceName = "WORKER_SEQ", allocationSize = 1)
    @Column(name = "ID_WORKER")
    private Long idWorker;

    @Column(name = "FIRST_NAME_WORKER")
    private String firstName;

    @Column(name = "LAST_NAME_WORKER")
    private String lastName;

    @Column(name = "DNI_WORKER")
    private String dni;

    @Column(name = "ESTADO_WORKER")
    private String estado;

    @Column(name = "DATE_BIRTH_WORKER")
    private LocalDate dateOfBirth;

    @Column(name = "GENDER_WORKER")
    private String gender;

    @Column(name = "CONTACT_NUMBER_WORKER")
    private String contactNumber;

    @Column(name = "EMAIL_WORKER")
    private String email;

    @Column(name = "REGISTRATION_DAY")
    private LocalDate registrationDay;

    @Column(name = "CREATION_BY")
    private String createdBy;

    @Column(name = "MODIFICATION_DAY")
    private LocalDate modificationDay;

    @Column(name = "MODIFICATION_BY")
    private String modificationBy;

    @Column(name = "ELIMINATION_DAY")
    private LocalDate eliminationDay;

    @Column(name = "ELIMINATION_BY")
    private String EliminationBy;
}
