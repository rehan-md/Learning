package coreJava_Basic;

public class Hello_Java {
public static void main(String[] args) {
	System.out.println("Hello Java");
	
	
	String arr []= {"food", "help", "give", "let", "null", "find", "hope", "left"};
	for(int i=0; i<arr.length; i++) {
		if(arr[i].contains("le"))
		System.out.println(arr[i]);
	}
}
}
