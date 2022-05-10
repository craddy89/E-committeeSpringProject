package com.yaksun.ecommitteespringproject.service;

import com.yaksun.ecommitteespringproject.domain.Exam;
import com.yaksun.ecommitteespringproject.domain.User;

import java.util.List;

public interface ExamService {
    List<Exam> findAll();
    List<Exam> findAllForStudent(User user);

    Exam findById(Integer examId);
    Long count();

    Exam registerStudent(Integer examId, User student);
    Exam save(Exam exam);

    void delete(Exam exam);
}
