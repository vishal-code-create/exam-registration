package com.crio.examregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.examregistration.entity.Student;
import com.crio.examregistration.exchange.RequestStudentDto;
import com.crio.examregistration.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudentRecord(RequestStudentDto dto) {
		return studentRepository.save(new Student(dto.getName()));
	}

}
