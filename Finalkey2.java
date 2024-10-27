package elipsetutorial;
import java.util.Scanner;
public class Finalkey2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	try {
		
		int Age= scan.nextInt();
		if(Age<1) {
			throw new ArithmeticException("age should be greater than 1");
		}
	}
	
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	
}
}