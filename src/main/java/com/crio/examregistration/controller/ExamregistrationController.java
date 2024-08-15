package com.crio.examregistration.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crio.examregistration.entity.Exam;
import com.crio.examregistration.entity.Student;
import com.crio.examregistration.entity.Subject;
import com.crio.examregistration.exchange.RequestStudentDto;
import com.crio.examregistration.exchange.RequestSubjectDto;
import com.crio.examregistration.service.ExamService;
import com.crio.examregistration.service.StudentService;
import com.crio.examregistration.service.SubjectService;

@RestController
public class ExamregistrationController {

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private ExamService examService;

	@PostMapping("/subjects")
	public ResponseEntity<Subject> createSubject(@RequestBody RequestSubjectDto requestDto) {
		System.out.println("inside method");
		Subject subject = subjectService.createSubject(requestDto);
		return ResponseEntity.status(201).body(subject);
	}

	@PostMapping("/students")
	public ResponseEntity<Student> saveStudentRecord(@RequestBody RequestStudentDto requestDto) {
		System.out.println("inside method");
		Student student = studentService.saveStudentRecord(requestDto);
		return ResponseEntity.status(201).body(student);
	}

	@PostMapping("/exams")
	public ResponseEntity<Object> saveExamRecord(@RequestBody RequestSubjectDto requestDto) {
		System.out.println("inside exam method");
		Optional<Subject> optionalSubject = subjectService.getSubjectObjectFromSubjectName(requestDto);
		if (optionalSubject.isEmpty())
			return ResponseEntity.status(500).body("Subject name is not valid");
		Exam exam = examService.saveExamRecord(optionalSubject.get());
		return ResponseEntity.status(201).body(exam);
	}

}