package coreJava_Basic;

import java.util.Scanner;

public class Swap_Example {
	
	
	public void withThirdVar(int a, int b) {
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
	}
public void withoutThirdVar() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Value of A");
	int a=sc.nextInt();
	System.out.println("Enter Value of B");
	int b=sc.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
	}

	public static void main(String[] args) {
		Swap_Example obj=new Swap_Example();
		obj.withoutThirdVar();
	}
}
