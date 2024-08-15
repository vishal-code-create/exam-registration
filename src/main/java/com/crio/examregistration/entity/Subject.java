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
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Getter
@NoArgsConstructor
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Nonnull
    private String name;
    
    @ManyToMany
    private List<Student> registeredStudents = new ArrayList<>();
    
}
