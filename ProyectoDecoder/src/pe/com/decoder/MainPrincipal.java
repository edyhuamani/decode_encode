package pe.com.decoder;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.codec.binary.Base64;

public class MainPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("imprime");
		try{
		
			byte[] bytes = Files.readAllBytes(new File("c:\\sample\\mansory.jpg").toPath());
			String imageDataString = Base64.encodeBase64URLSafeString(bytes);
			System.out.println(imageDataString);
			File io=new File("c:\\sample\\mansory2.jpg");
			FileOutputStream fos=new FileOutputStream(io);
			byte[] imageDataBytes = Base64.decodeBase64(imageDataString);
					
			BufferedOutputStream os=new BufferedOutputStream(fos);
			os.write(imageDataBytes);
			os.close();
			System.out.println("imprime fin");

		}catch(Exception e){
			System.out.println(e);
		}
//		public static void main(String[] args) {
//		try{
//		
//			File file=new File("");
//			//FileInputStream fis=new FileInputStream(file);
//			InputStream in=new FileInputStream(file);
//			BufferedInputStream bis=new BufferedInputStream(in);
//			String data=new String();
//			Path path=Paths.get("c:\\sample\\mansory.jpg");
//			byte[] bytes=Files.readAllBytes(path);
//			
//			String imageDataString = Base64.encodeBase64URLSafeString(bytes);
//			System.out.println(imageDataString);
//			File io=new File("c:\\sample\\mansory2.jpg");
//			FileOutputStream fos=new FileOutputStream(io);
//			byte[] imageDataBytes = Base64.decodeBase64(imageDataString);
//					
//			BufferedOutputStream os=new BufferedOutputStream(fos);
//			os.write(imageDataBytes);
//			os.close();
//		}catch(Exception e){
//			
//		}
//	}


	}

}
