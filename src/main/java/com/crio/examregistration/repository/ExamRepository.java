package com.crio.examregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.examregistration.entity.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer> {

}
