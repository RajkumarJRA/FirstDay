package org.test.login;

public class EmployeeConstructor {
	public EmployeeConstructor() {
		System.out.println("default con");
	}
	public EmployeeConstructor(int id) {
		System.out.println("intparametarized con:"+id);
	}
	public EmployeeConstructor(String raj ) {
		System.out.println("stringparametarized con:"+raj);
	}
	public EmployeeConstructor(String jey ,long phone ) {
		System.out.println("parametarized con:"+jey+"\t"+phone);
	}
	
	public static void main(String[] args) {
		EmployeeConstructor e=new EmployeeConstructor ();
		EmployeeConstructor e1=new EmployeeConstructor (1223);
		EmployeeConstructor e2=new EmployeeConstructor ("kramski");
		EmployeeConstructor e3=new EmployeeConstructor ("jey",23456778l);
		
	}
	
	
	
	
}