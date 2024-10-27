package elipsetutorial;
import java.util.Scanner;
public class Exceptionhandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
try {
	int  a = scan.nextInt();
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println("prgram ended");
	}

}
