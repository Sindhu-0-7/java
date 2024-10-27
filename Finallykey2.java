package elipsetutorial;

public class Finallykey2 {
public static void main(String[] args) {
	int err=0;
	try {
		int a=10/0;
		err=0;
	}
	catch(Exception e) {
		 err=1;
		System.out.println(e);
	}
	finally {
		if(err==1) {
			System.out.println("error");
		}
		else {
			System.out.println("no error");
		}
	}
}
}
