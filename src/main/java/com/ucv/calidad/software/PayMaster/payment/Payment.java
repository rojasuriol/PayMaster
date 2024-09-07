package com.ucv.calidad.software.PayMaster.payment;

import com.ucv.calidad.software.PayMaster.laborContract.LaborContract;
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
@Table(name = "PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAYMENT")
    private Long idPayment;

    @ManyToOne
    @JoinColumn(name = "ID_CONTRACT")
    private LaborContract laborContract;

    @Column(name = "DATE_PAYMENT")
    private LocalDate datePayment;

    @Column(name = "AMOUNT_PAYMENT")
    private BigDecimal amountPayment;

    @Column(name = "DEDUCTIONS_PAYMENT")
    private BigDecimal deductionsPayment;

    @Column(name = "BONUSES_PAYMENT")
    private BigDecimal bonusesPayment;

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
