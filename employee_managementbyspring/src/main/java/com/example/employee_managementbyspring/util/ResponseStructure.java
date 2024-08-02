package com.example.employee_managementbyspring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStructure <T>{
	int ststuscode;
	String msg;
	T data;

}
