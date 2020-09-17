package Day4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedCopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\PWJ\\Desktop\\homework\\myfile.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\PWJ\\Desktop\\homework\\myfile_cp2.tx");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		byte[] data=new byte[1024*10];
		int len=-1;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		System.out.println("myfile_cp2.tx¸´ÖÆÍê³É");
		bis.close();
		bos.close();
	}

}
