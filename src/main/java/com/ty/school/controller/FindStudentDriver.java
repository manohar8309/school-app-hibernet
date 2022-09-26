package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.StudentDAO;
import com.ty.school.dto.Student;

public class FindStudentDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentDAO dao=new StudentDAO();
		System.out.println("enter student id ");
		int id=scanner.nextInt();
		Student student=dao.findStudent(id);
		System.out.println("roll num="+student.getRol());
		System.out.println("name="+student.getName());
		System.out.println("percentage="+student.getPercentage());
	}

}
