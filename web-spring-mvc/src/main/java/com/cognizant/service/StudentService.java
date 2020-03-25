package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Student;

@Service
public class StudentService {
	private List<Student> list=new ArrayList<Student>();
	public String insert(Student student) {
		if(list.add(student)) {
			return "Success";
		}else {
			return "Fail";
		}
	}
	public List<Student> getAll(){
		return list;
	}
	public String update(int id, String name, int marks) {
		for(Student s:list) {
			if(s.getId()==id) {
				s.setName(name);
				s.setMarks(marks);
				return "Success";
			}
		}
		return "Failure";
	}
	
	public String delete(int id) {
		for(Student s:list) {
			if(s.getId()==id) {
				list.remove(s);
				return "Success";
			}
		}
		return "Failure";
	}
}
