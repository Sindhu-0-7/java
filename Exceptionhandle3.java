package elipsetutorial;
import java.util.Scanner;
public class Exceptionhandle3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	
	
	try {
	 a = scan.nextInt();
	 b = scan.nextInt();
c=0;
		
	 c=a/b;
	}

	catch(ArithmeticException e) {
		System.out.println("ro");
	}
	catch (Exception e) {
		System.out.println("ecp");
	}
	System.out.println("program");
}
}
