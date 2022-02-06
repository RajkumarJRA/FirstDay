package org.test.login;

public class Sample {
	public Sample() {
		this(2000);
		System.out.println("default con");
		
	}
    public Sample(int id) {
    	this("jraraj44@gmail.com",23456678l);
    	System.out.println("int para con");
    	System.out.println(id);
    }
    public Sample(String email,long phn) {
    	System.out.println("String long para con");
    	System.out.println(email);
    	System.out.println(phn);
    }
    public static void main(String[] args) {
		Sample s=new Sample();
	}
    
    
    
}
