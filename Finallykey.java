package elipsetutorial;

public class Finallykey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=10/0;
	
}
catch(Exception e) {
	System.out.println(e);
}
finally{
	System.out.println("finally");
}
	}

}
