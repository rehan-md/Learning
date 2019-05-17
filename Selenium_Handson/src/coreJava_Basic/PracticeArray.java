package coreJava_Basic;

import java.util.Scanner;

public class PracticeArray {
	
	Scanner sc=new Scanner(System.in);
	public void findSmallest() {
//		System.out.println("Enter size of the Array");
//        int size=sc.nextInt();
//		int [] numArr=new int[size];
//		System.out.println("Enter the number");
//		for(int i=0;i<size;i++) {
//			numArr[i]=sc.nextInt();
//		}
		int [] numArr= {55, 12, 11, 89, 62};
		int temp;
		for(int i=0;i<numArr.length;i++) {
			for(int j=i+1;j<numArr.length;j++) {
				if(numArr[i]>numArr[j]) {
					temp=numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=temp;
				}
				
			}
		}
		System.out.println(numArr[0]);
		
}
	
	public void sortArray(){
		int [] numArr= {55, 12, 11, 89, 62};
		int temp;
		for(int i=0;i<numArr.length;i++) {
			for(int j=i+1;j<numArr.length;j++) {
				if(numArr[i]>numArr[j]) {
					temp=numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=temp;
				}
				
			}
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.println(numArr[i]);
		}
	}
	public static void main(String[] args) {
		PracticeArray obj=new PracticeArray();
		obj.findSmallest();
	}
}
