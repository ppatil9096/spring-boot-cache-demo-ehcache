package com.patjavahere.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.patjavahere.model.Student;

@Service
public class StudentService {
	@Cacheable("studentCache")
	public List<Student> findAll() {
		System.out.println("retrieving students");
		return List.of(new Student("ppp", "a@a.com", 1), new Student("aaron", "b@b.com", 2));
	}
}
