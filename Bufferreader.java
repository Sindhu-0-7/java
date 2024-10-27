package elipsetutorial;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
public class Bufferreader {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("file1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		}
	catch(Exception e) {
		
	}
}
}

