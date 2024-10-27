package elipsetutorial;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class FileWriter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw = new FileWriter("file1.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	fw.write("heeyy");
	fw.append("hello");
	fw.close();
	System.out.println("success");
	
}

catch(Exception e) {
	System.out.println("happended smething");
}
	}

}

