package elipsetutorial;
interface printable{
	void display();
}
interface showable{
	void display();
	
}

class C implements printable,showable{
	public void display() {
		System.out.println("print&show");
	}
}
public class Interfaceinmulinherit {
public static void main(String[] args) {
	C c1 = new C();
	c1.display();
}
}
