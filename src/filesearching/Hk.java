package filesearching;

import java.io.File;

public class Hk {
	public static void main(String[] args) {
		

	File file = new File("C:\\abcd.txt");
	
	boolean ff = file.exists();
	System.out.println(ff);
	
	String dd = file.getName();
	System.out.println(dd);
	
	
	String gg = file.getPath();
	System.out.println(gg);
	
	
	}
	
}
