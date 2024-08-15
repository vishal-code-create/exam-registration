package com.crio.examregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.examregistration.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
