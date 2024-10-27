package elipsetutorial;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Filereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileReader fr = new FileReader("file2.txt");
	int c = fr.read();
	while(c!=-1) {
		System.out.println((char)c);
		c=fr.read();
	}
	fr.close();
}
catch(Exception e) {
	
}
	}

}
