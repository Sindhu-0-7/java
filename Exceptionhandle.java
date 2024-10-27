package elipsetutorial;
import java.util.Scanner;
public class Exceptionhandle {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
try {
	int a =10/0;
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println("program ended");
}
}