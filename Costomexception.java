package elipsetutorial;

import java.util.Scanner;
class notvalidException extends Exception{
	notvalidException(String s){
		super(s);
	}
}

public class Costomexception {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	try {
		int age=scan.nextInt();
		if(age<18) {
			throw new notvalidException("enter age greater than 18");
		}
	}
	catch(notvalidException e) {
		System.out.println(e);
	}
}
}
