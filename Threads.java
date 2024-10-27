package elipsetutorial;
class ace extends Thread{
	public void run(){
	for(int i=0;i<=4;i++) {
		System.out.println("hi");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class b extends Thread{
	public void run() {
for(int j=0;j<=6;j++) {
	System.out.println("outed");
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}
public class Threads {
public static void main(String[] args) {
ace obj1 = new ace();
	b obj2 = new b();
	obj1.start();
	obj2.start();
}
}
