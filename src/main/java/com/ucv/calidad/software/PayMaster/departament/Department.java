package com.ucv.calidad.software.PayMaster.departament;

import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DEPARTMENT")
    private Long idDepartment;

    @Column(name = "NAME_DEPARTMENT")
    private String name;

    @Column(name = "DESCRIPTION_DEPARTMENT")
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
    @OneToMany(mappedBy = "department")
    private Set<Worker> workers;
}
