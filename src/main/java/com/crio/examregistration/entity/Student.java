package com.crio.examregistration.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int registrationId;
	
	@Nonnull
    private String name;
    
    @ManyToMany
    private List<Subject> enrolledSubjects = new ArrayList<>();
    
    @ManyToMany
    private List<Exam> registeredExams = new ArrayList<>();
}
