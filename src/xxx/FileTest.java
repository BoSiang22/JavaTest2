package xxx;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
//		File dir = new File("C:\\JAVAWORK\\HELLO.TXT"); // Winodws和Mac的檔案系統沒有大小寫的區分
//		if(dir.delete()) {
//			System.out.println("success");
//		} else {
//			System.out.println("Failed...");
//		}

//		File dir = new File("C:\\Test\\abc");
//		dir.mkdir();
//		System.out.println(dir.mkdirs());

//		File file = new File("C:\\javawork\\hello.txt");
//		try {
//			file.createNewFile(); //建立hello檔案容器而已，檔案裡是沒有資料的
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		File dir = new File("C:\\javawork\\hello.txt");
		System.out.println(dir.getPath());

	}

}
