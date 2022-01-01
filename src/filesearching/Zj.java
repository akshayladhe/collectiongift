package filesearching;

import java.io.File;

public class Zj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("d:\\abcd.txt");
		
		boolean jj = file.canRead();
		System.out.println(jj);
		
		boolean vv = file.setReadOnly();
		
		
	}

}
