package com.crio.examregistration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

import com.crio.examregistration.constants.SubjectConstant;
import com.crio.examregistration.entity.Subject;
import com.crio.examregistration.exchange.RequestSubjectDto;
import com.crio.examregistration.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public Subject createSubject(RequestSubjectDto requestDto) {
		return subjectRepository.save(new Subject(requestDto.getName()));
	}

	public Optional<Subject> getSubjectObjectFromSubjectName(RequestSubjectDto requestDto) {
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withMatcher(SubjectConstant.NAME.getValue(), GenericPropertyMatchers.exact())
				.withIgnorePaths(SubjectConstant.ID.getValue());
		Example<Subject> exampleSubjectObject = Example.of(new Subject(requestDto.getName()), matcher);
		return subjectRepository.findOne(exampleSubjectObject);
	}
}
