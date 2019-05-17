package coreJava_Basic;

import java.util.Scanner;

public class Loop {

	public void fabonacci() {
		int a=0;
		int b=1;
		
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=10;i++) {			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
	}
}
	//Comment 
	public void primeNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean temp=false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(num+" is not prime");
				temp=true;
				break;
			}
		}
		if(num==0||num==1) {
			System.out.println(num+" is not prime");
		} 
		else if(temp==false) {
			System.out.println(num+" is prime");
		}
	}
	
	public static void main(String[] args) {
		Loop obj=new Loop();
		obj.primeNumber();
	}
}