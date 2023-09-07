package homework7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Hw7_4 {
 
 public static void main(String[] args) throws IOException {
	 File createDir = new File("C:\\data");
	 if(!createDir.exists()) {
		 createDir.mkdir();
	 }
	 
	 Dog dog1 = new Dog("AA");
	 Dog dog2 = new Dog("BB");
	 Cat cat1 = new Cat("CC");
	 Cat cat2 = new Cat("DD");
	 
	 File aFile = new File(createDir,"Object.ser");
	 
	 FileOutputStream fos = new FileOutputStream(aFile);
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 
	 Object[] ob = {dog1, dog2, cat1, cat2};
	 
	 for(int i = 0; i < ob.length; i++) {
		 oos.writeObject(ob[i]);
	 }
	 oos.close();
	 fos.close();
	 
	 
	 
 }
}
