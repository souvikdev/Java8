package com.sdg.jdk8.client;

import java.util.ArrayList;
import java.util.List;

import com.sdg.jdk8.interfaces.MyInterface;
import com.sdg.jdk8.interfacesImpl.MyClass;
import com.sdg.jdk8.model.Student;

public class ClientTest {

	public static void main(String[] args) {
	
		MyInterface myInterface = new MyClass();
        
		Student s1 = new Student("Souvik",23);
		Student s2 = new Student("Barun", 21);
		Student s3 = new Student("Tarun", 22);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		myInterface.sortStudents(studentList);
		
		for(Student st : studentList) {
			System.out.println(st.getName()+"  "+st.getAge());
		}
		
		MyInterface.greet("Suman");
	}

}
