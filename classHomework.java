package Test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class classHomework {

		public static void main(String[] args) {


		}

		@Test

		public void test1() throws IOException{

		FileInputStream fis = new FileInputStream("myfile.txt");//read

		FileOutputStream fos = new FileOutputStream("myfile_cp.txt");//write

		int d = -1;

		while((d=fis.read()) != -1){

		fos.write(d);

		}

		System.out.println("¸´ÖÆÍê±Ï£¡");

		fis.close();

		fos.close();

		}
}
