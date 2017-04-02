package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws Exception {
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
		int c;
		while((c=in.read())!=-1)
			System.out.print((char)c);
	}
}
