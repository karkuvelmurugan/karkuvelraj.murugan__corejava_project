package day05.practice;

public class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign department and respective attributes
	
	
	public Student(String name, int id, Department department) {
		
		this.name = name;
		this.id = id;
		this.department = department;
		
	}
	
//	public void printStudentDetails() {
//		System.out.println("Student name: " + name);
//		System.out.println("Student id: " + id);
//		System.out.println("Department details :");
//		this.department.printDepartmentDetails();
//	}
//	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department details = " + this.department.toString() + "]";
	}
}
