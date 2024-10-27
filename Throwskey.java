package elipsetutorial;
class calc{
	void div() throws Exception{
		int a=10/0;
	}
}
public class Throwskey {
public static void main(String[] args) {
	calc v1= new calc();
	try {
	v1.div();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
