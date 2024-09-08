package com.ucv.calidad.software.PayMaster.paymentHistory;

import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYMENT_HISTORY")
public class paymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAYMENT_HISTORY")
    private int idPaymentHistory;

    @ManyToOne
    @JoinColumn(name = "ID_WORKER")
    private Worker worker;

    @Column(name = "GENERATION_DATE_PAYMENT_HISTORY")
    private LocalDate generationDate;

    @Column(name = "DESCRIPTION_PAYMENT_HISTORY")
    private String description;

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
