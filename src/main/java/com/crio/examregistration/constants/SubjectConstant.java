package com.crio.examregistration.constants;

import lombok.Getter;

@Getter
public enum SubjectConstant {
	
	ID("id"), NAME("name");
	
	private SubjectConstant(String value) {
		this.value = value;
	}
	
	private final String value;

}
