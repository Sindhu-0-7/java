package elipsetutorial;
interface readable{
	void read();
}
interface  writeble{
	void write();
}
interface storable{
	void store();
}

class file implements readable,writeble,storable{
	public void read() {
		System.out.println("read");
	}
	public void write() {
	System.out.println("write");	
	} 
	public void store() {
		System.out.println("store");
	}
}
public class Interfacemulinherit {
public static void main(String[] args) {
	file c1 = new file();
	c1.read();
	c1.write();
	c1.store();
}
}
