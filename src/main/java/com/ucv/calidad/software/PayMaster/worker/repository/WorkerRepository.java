package com.ucv.calidad.software.PayMaster.worker.repository;

import com.ucv.calidad.software.PayMaster.worker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
