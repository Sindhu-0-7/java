package elipsetutorial;
interface playable{
	void play();
}
class piono implements playable{
	public void play() {
		System.out.println("plesent music");
	}
}
class guitar implements playable{
	public void play() {
		System.out.println("great music");
	}
}
public class Interface2 {
public static void main(String[] args) {
	piono p1 =new piono();
	p1.play();
	guitar g1 = new guitar();
	g1.play();
}
}
