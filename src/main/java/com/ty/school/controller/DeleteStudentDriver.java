package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.StudentDAO;
import com.ty.school.dto.Student;

public class DeleteStudentDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentDAO dao=new StudentDAO();
		System.out.println("enter student id ");
		int id=scanner.nextInt();
		System.out.println(dao.deleteStudent(id));
		
	}


}
