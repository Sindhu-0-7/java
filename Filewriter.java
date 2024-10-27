package elipsetutorial;
import java.io.FileWriter;
public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw = new FileWriter("file1.txt",true);
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
