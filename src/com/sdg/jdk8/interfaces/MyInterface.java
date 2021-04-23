package com.sdg.jdk8.interfaces;

import java.util.Collections;
import java.util.List;

import com.sdg.jdk8.model.Student;

public interface MyInterface {

	default public List<Student> sortStudents(List<Student> students){
		 Collections.sort(students);
		
		 return students;
	}
	
	public static void greet(String name) {
		System.out.println("Welcome "+name);
	}
	
	Integer getMaxNum(List<Integer> numbers);
	
}
