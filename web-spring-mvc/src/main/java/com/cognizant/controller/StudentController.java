package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping(value="insert" ,method=RequestMethod.GET)
	public String insertPage() {		
		return "insert";
	}
	
	@RequestMapping(value="insert" ,method=RequestMethod.POST)
	public String insert(HttpServletRequest request) {	
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int marks=Integer.parseInt(request.getParameter("marks"));
		Student student=new Student(id,name,marks);
		String result=studentService.insert(student);
		request.setAttribute("msg", result);
		return "insert";
	}
	
	@RequestMapping(value="getAll")
	public String getAll(HttpServletRequest request) {
		List<Student> list=studentService.getAll();
		request.setAttribute("list", list);
		return "display";
	}

	@RequestMapping(value="update" ,method=RequestMethod.GET)
	public String updatePage() {		
		return "update";
	}
	
	@RequestMapping(value="update" ,method=RequestMethod.POST)
	public String update(HttpServletRequest request) {	
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int marks=Integer.parseInt(request.getParameter("marks"));
		String result=studentService.update(id,name,marks);
		request.setAttribute("msg", result);
		return "update";
	}
	
	@RequestMapping(value="delete" ,method=RequestMethod.GET)
	public String deletePage() {		
		return "delete";
	}
	
	@RequestMapping(value="delete" ,method=RequestMethod.POST)
	public String delete(HttpServletRequest request) {	
		int id=Integer.parseInt(request.getParameter("id"));
		String result=studentService.delete(id);
		request.setAttribute("msg", result);
		return "delete";
	}
}
