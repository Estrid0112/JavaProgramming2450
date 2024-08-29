package lectorial05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageIO {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("./src/lectorial05/Melburnian_Skyline.jpg"));
		byte[] image = fis.readAllBytes();
		fis.close();
		
		
		FileOutputStream fos = new FileOutputStream(new File("./src/lectorial05/wed.jpg"));
		fos.write(image);
		fos.close();
	}
}
