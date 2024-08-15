package com.crio.examregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.examregistration.entity.Exam;
import com.crio.examregistration.entity.Subject;
import com.crio.examregistration.repository.ExamRepository;

@Service
public class ExamService {

	@Autowired
	private ExamRepository examRepository;

	public Exam saveExamRecord(Subject subject) {
		return examRepository.save(new Exam(subject));
	}

}
