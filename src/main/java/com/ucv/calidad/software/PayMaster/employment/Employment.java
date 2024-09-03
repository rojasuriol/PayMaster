package com.ucv.calidad.software.PayMaster.employment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYMENT")
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYMENT_SEQ")
    @SequenceGenerator(name = "EMPLOYMENT_SEQ", sequenceName = "EMPLOYMENT_SEQ", allocationSize = 1)
    @Column(name = "ID_EMPLOYMENT")
    private Long idEmployment;

    @Column(name = "JOB_TITLE", nullable = false)
    private String jobTitle;

    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    @Column(name = "DATE_OF_HIRE", nullable = false)
    private LocalDate dateOfHire;

    @Column(name = "EMPLOYMENT_STATUS", nullable = false)
    private String employmentStatus;

    @Column(name = "SALARY", nullable = false)
    private Double salary;

    @Column(name = "SALARY_TYPE", nullable = false)
    private String salaryType;

    @Column(name = "CONTRACT_TYPE", nullable = false)
    private String contractType;

    @Column(name = "SHIFT", nullable = false)
    private String shift;

    @Column(name = "WORK_LOCATION", nullable = false)
    private String workLocation;

    @Column(name = "SUPERVISOR_ID")
    private Long supervisorId;

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
