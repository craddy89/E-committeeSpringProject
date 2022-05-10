package com.yaksun.ecommitteespringproject.repository;

import com.yaksun.ecommitteespringproject.entity.MajorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MajorRepository extends JpaRepository<MajorEntity, Integer> {
}
