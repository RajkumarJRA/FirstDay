package org.test.login;

public class Employee {
	public Employee() {
		this("greens",345678l);
		System.out.println("default constructor");
		}
	public Employee(int id) {
		this("greens");
		System.out.println("int parameterized constructor"+id);                 
	}
    public Employee(String name) {
    	System.out.println("string parameterized constructor"+name);
    }
    public Employee(String name,long pho) {
     this(3456);
     System.out.println("parameterized constructor"+name+"\n"+pho);
    }
    public static void main(String[] args) {
		Employee e=new Employee();
		
	}
    
    
    
    
}
