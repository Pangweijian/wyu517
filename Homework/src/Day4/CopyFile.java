package Day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		String fileSrc = "C:\\Users\\PWJ\\Desktop\\homework\\myfile.txt";
		String fileDes = "C:\\Users\\PWJ\\Desktop\\homework\\myfile_cp.txt";
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(fileSrc);
			fo = new FileOutputStream(fileDes);
			in = fi.getChannel();
			out = fo.getChannel();
			in.transferTo(0, in.size(), out);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				in.close();
				fo.close();
				out.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("myfile_cp.txt文件夹文件复制完成");
	}

}
