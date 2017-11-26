package com.deemwar.sonar;

public class Calculator {
    public String printAppName() {
        return "Calculator.";
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().printAppName());
    }
    

	  public int add(int  x,int y) {
		  return x +y;
	  }

	  public int multiply(int  x,int y) {
		  return x * y;
	  }
	  
	  public int subtract(int  x,int y) {
		  return x - y;
	  }
}
