package homework7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw7_3 {
	
	public static void copyFile(File readFile, File writeFile) throws IOException {
		
		
		FileReader in = new FileReader(readFile);
		FileWriter out = new FileWriter(writeFile);
		
		int c;
		
		while((c = in.read()) !=-1 ) {
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}
		
		in.close();
		out.close();
				
	}
	
	
	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("src/homework7/readfile.txt");
		File outputFile = new File("writeFile.txt");
			
		copyFile(inputFile, outputFile);
	}
	
	
}
