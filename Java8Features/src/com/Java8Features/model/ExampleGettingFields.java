package com.Java8Features.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.Java8Features.repository.PersonRepository;

public class ExampleGettingFields {

	public static void main(String[] args) {
		//Person person = PersonRepository.getPerson();
		Field[] field = Person.class.getDeclaredFields();
		System.out.println(field.length);
		System.out.println(field[0].getName());
		System.out.println(field[0].getType());
		
		Method[] method = Person.class.getDeclaredMethods();
		Person person = new Person();
		Parameter[] parameter = method[2].getParameters();
		System.out.println(parameter[0].getName());
		method[1].getParameters();
		System.out.println(method[2]);
	}

}
