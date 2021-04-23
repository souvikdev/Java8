package com.sdg.jdk8.interfacesImpl;

import java.util.Collections;
import java.util.List;

import com.sdg.jdk8.interfaces.MyInterface;

public class MyClass implements MyInterface{

	@Override
	public Integer getMaxNum(List<Integer> numbers) {
		return Collections.max(numbers);
	}

}
