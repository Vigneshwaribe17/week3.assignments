package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("The student name is Vigneshwari");
	}
	public void studentId()
	{
		System.out.println("The student id is 12345678");
		
	}
	public void studentDept()
	{
		System.out.println("The student dept is CSE");
	}
	
	public static void main(String[] args) {
		
		Student std =new Student();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentId();
		std.studentName();
		std.studentDept();
		
	}
}
