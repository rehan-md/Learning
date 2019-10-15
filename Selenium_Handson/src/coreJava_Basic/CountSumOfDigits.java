package coreJava_Basic;

public class CountSumOfDigits {
	
	public static void main(String[] args) {
		
		int num=1234567895;
		int sod=0;
		while(num!=0) {
			
			
			sod=num%10+sod;
			
			num=num/10;
			
		}
		System.out.println(sod);
	}
	
		

}
