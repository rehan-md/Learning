package coreJava_Basic;

import java.util.Scanner;

public class ConditionalHandling {

	
	
	public void weightConverter() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Weight: ");
		float weight=sc.nextFloat();
		System.out.println("(L)bs or (K)g:");
		Scanner sc1=new Scanner(System.in);
		String input_unit=sc1.nextLine();
		
		if(input_unit.equals("k")) {
		System.out.println("You are " + weight*2.205+ " pounds");	
		}
		else if(input_unit.equals("l")) {
			System.out.println("You are " + weight*0.454+ " kilograms");	
		}
		else {
			 System.out.println("Invalid Unit entered");
		}
		
	}

//	public void checkGreaterNumber(	int a, int b, int c) {
//		if(a>b && a>c) {
//			System.out.println("The Largest integer is "+a);
//		}
//		else if(b>a && b>c) {
//			System.out.println("The Largest integer is "+b);
//		}
//		else if(c>a && c>b) {
//			System.out.println("The Largest integer is "+c);
//		}
//	}
//	
//	public void checkDivisiblity() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int num=sc.nextInt();
//		if(num%5==0 && num%11==0) {
//			System.out.println(num+" is divisble by both 5 and 11");
//		}
//		else if(num%5==0){
//			System.out.println(num+" is divisble by 5");
//		}
//        else if(num%11==0){
//        	System.out.println(num+" is divisble by 11");
//		}
//        else {
//        	System.out.println("The number is not divisble by either 5 & 11");
//        }
//	}
//	
//	
	public static void main(String[] args) {
		
		ConditionalHandling obj=new ConditionalHandling();
		obj.weightConverter();
	}
}
