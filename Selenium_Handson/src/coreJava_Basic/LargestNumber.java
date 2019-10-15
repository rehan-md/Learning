package coreJava_Basic;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the numbers");
		int temp=0;
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("Largest number: "+ arr[0]);
		System.out.println("Descensing Sorting");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}
}
