package com.ucv.calidad.software.PayMaster.worker.entity;

import com.ucv.calidad.software.PayMaster.departament.Department;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_WORKER")
    private Long idWorker;

    @Column(name = "FIRST_NAME_WORKER")
    private String firstName;

    @Column(name = "LAST_NAME_WORKER")
    private String lastName;

    @Column(name = "DNI_WORKER")
    private String dni;

    @Column(name = "STATUS_WORKER")
    private String status;

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

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MODIFICATION_DAY")
    private LocalDate modificationDay;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "DELETED_DAY")
    private LocalDate deletedDay;

    @Column(name = "DELETED_BY")
    private String deletedBy;

    @ManyToOne
    @JoinColumn(name = "ID_DEPARTMENT")
    private Department department;
}
