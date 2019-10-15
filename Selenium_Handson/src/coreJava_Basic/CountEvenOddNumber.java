package coreJava_Basic;

public class CountEvenOddNumber {
	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int num=123593569;
		
		while(num!=0) {
			int digit=num%10;
			if(digit%2==0) {
				even++;
			}
			else {
				odd++;
			}
			num=num/10;
			
		}
		System.out.println("Number of even digits: "+even);
		System.out.println("Number of odd digits: "+odd);
	}

}
