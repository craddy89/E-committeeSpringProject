package com.yaksun.ecommitteespringproject.repository;

import com.yaksun.ecommitteespringproject.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity, Integer> {
}
