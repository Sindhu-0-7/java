package elipsetutorial;
class age extends Thread{
	int j=0;
	public void run() {
		
		
			j=1;
	
	}
}
public class Join {
public static void main(String[] args) {
	age a1 = new age();
	a1.start();
	 
	System.out.println(a1.j);
}
}
