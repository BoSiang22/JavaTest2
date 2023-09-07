package homework7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Hw7_2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\THA103_Workspace\\JavaTest\\src\\homework7\\Data.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		for(int i = 0; i < 10 ; i++) {
			ps.println((int) (Math.random()* 1000 + 1));
		}
		ps.close();
		bos.close();
		fos.close();
		
	}
	
	
}
