package com.crio.examregistration.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor //this was important
public class RequestStudentDto{

	@JsonProperty("name")
    private String name;

}