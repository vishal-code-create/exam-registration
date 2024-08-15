package com.crio.examregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crio.examregistration.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
