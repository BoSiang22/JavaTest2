package homework7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File aFile = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(aFile);
		ObjectInputStream oos = new ObjectInputStream(fis);
		
		try {
			Object obj;
			while((obj = oos.readObject()) != null) {
				if(obj instanceof Cat) {
					((Cat) obj).speak();
				} else if (obj instanceof Dog ) {
					((Dog) obj).speak();
				}					
			}
			
			
		} catch (EOFException e) {
			System.out.println("資料讀取完畢");	
		}
		oos.close();
		fis.close();
		
		
	}
}
