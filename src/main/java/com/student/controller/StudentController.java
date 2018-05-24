package com.student.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.db.StudentDB;
import com.student.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDB edb;
	
	@RequestMapping("/studentform")
	public ModelAndView showform() {
		return new ModelAndView("studentform", "command", new Student());
	}

	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Student student) {
		edb.insert(student);
		return new ModelAndView("redirect:/viewstudent");
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute Student student){
		return new ModelAndView("redirect:/viewstudent");
	}

	@RequestMapping("/viewstudent")
	public ModelAndView view() {
		ArrayList<Student> list = edb.getAllStudents();
		return new ModelAndView("viewstudent", "list", list);
	}
}
