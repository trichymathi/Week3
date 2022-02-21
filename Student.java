package org.student;
 //Multilevel Inheritance
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("STUDENT NAME IS : MATHI MARAN");
	}
	public void studentDept() {
		System.out.println("STUDENT DEPARTMENT IS : MECHANICAL");
	}
	public void studentId() {
		System.out.println("STUDENT ID ID : MEA17049");
	}

	public static void main(String[] args) {
		Student data =new Student();
		data.collegeName();
		data.collegeCode();
		data.collegeRank();
		data.deptName();
		data.studentName();
		data.studentDept();
		data.studentId();

	}

}
