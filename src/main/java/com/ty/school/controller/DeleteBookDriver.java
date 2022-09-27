package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.ReferenceBookDAO;

public class DeleteBookDriver {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ReferenceBookDAO bookDAO=new ReferenceBookDAO();
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println(bookDAO.deleteBook(id));;
	}

}
