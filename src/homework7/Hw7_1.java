package homework7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String[] args) throws IOException {
		int i;
		int charSum=0;
		int lineSum=0;
		File sample = new File("./src/homework7/Sample.txt");
		FileReader fr = new FileReader(sample);
		BufferedReader br = new BufferedReader(fr);
		
		while ((i = br.read()) != -1) {
			if (i != '\r') {
				charSum++;
			}
			
			if(i == '\n') {
				lineSum++;
			}
		}
		
		System.out.println(sample.getName() + "的檔案共有" + sample.length() + "個位元組、" 
						   + charSum + "個字元、" + lineSum + "列資料");
		
	}
	
}
