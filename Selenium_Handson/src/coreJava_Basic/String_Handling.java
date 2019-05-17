package coreJava_Basic;

import java.util.Scanner;

public class String_Handling {

	Scanner sc=new Scanner(System.in);
	public void compareLastCharcters() {
		
		System.out.println("Enter the first String: ");
		String s1=sc.nextLine();
		System.out.println("Enter the second String: ");
		String s2=sc.nextLine();
		System.out.println("Enter the number of last character to be compared");
		int num=sc.nextInt();
	   String ss1=s1.substring(s1.length()-num, s1.length());
	   String ss2=s2.substring(s2.length()-num, s2.length());
	   if(ss1.equalsIgnoreCase(ss2)) {
		   System.out.println("The last "+num+" characters are same");
	   }
	   else {
		   System.out.println("The last "+num+" characters are different");
	   }
	}
	
	public void alternateUpperLowerCaseWord() {
		System.out.println("Enter the sentence: ");
		String s1=sc.nextLine();
		String [] sArray=s1.split(" ");
		for(int i=0;i<sArray.length;i++) {
			if(i%2==0) {
				System.out.print(sArray[i].toUpperCase()+" " );
			}
			else {
				System.out.print(sArray[i].toLowerCase()+" " );
			}
			
		}
	}
public void dublicate() {
	System.out.println("Enter the string");
	String s1=sc.nextLine();
	String [] arr=s1.split(" "); 
	System.out.println("Number of word in String: "+arr.length);
	int count=1;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i].equalsIgnoreCase(arr[j])) {
			count=count +1;
			arr[j]="0";
			}
		}
		if(count>1 && arr[i] !="0") {
			System.out.println(arr[i]+": "+count);
			
		}
		else if(arr[i] !="0"){
			System.out.println(arr[i]+": "+count);
		}
		count=1;
	}
	
}
public void removeSpaces() {
	String s= "   this is a testing world  ";
	String s1=s.replace(" ", "");
	System.out.println(s);
	System.out.println(s1);
	System.out.println("Number of spaces in string: "+(s.length()-s1.length()));
}
	public void reverseString() {
		String s="HelloJava";
//	    for(int i=s.length()-1;i>=0;i--) {
//	    	System.out.print(s.charAt(i));
//	    }
		String []arr=s.split("");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
				
	}
	public static void main(String[] args) {
		String_Handling obj=new String_Handling();
		obj.removeSpaces();
	}
}
