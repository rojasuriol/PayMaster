package com.ucv.calidad.software.PayMaster.laborContract;

import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LABOR_CONTRACT")
public class LaborContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTRACT")
    private Long idContract;

    @ManyToOne
    @JoinColumn(name = "ID_WORKER")
    private Worker worker;

    @Column(name = "TYPE_CONTRACT")
    private String typeContract;

    @Column(name = "SALARY_CONTRACT")
    private BigDecimal salaryContract;

    @Column(name = "START_DATE_CONTRACT")
    private LocalDate startDateContract;

    @Column(name = "END_DATE_CONTRACT")
    private LocalDate endDateContract;

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
}
