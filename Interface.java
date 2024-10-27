package elipsetutorial;
interface Animal{
	int marks=12;
	String name="rohith";
	void sound();
}
class cat implements Animal{
	public void sound() {
		
		System.out.println("meawww");
	}
}
public class Interface {
	public static void main(String[] args) {
		cat c1 = new cat();
	System.out.println(c1.name);
	System.out.println(c1.marks);
	c1.sound();
}
}
