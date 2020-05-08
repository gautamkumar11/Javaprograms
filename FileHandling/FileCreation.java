import java.io.*;

public class FileCreation {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="F:/new folder/filehandling/gautam.txt";
		File file=new File(path);
		boolean a=file.createNewFile();
		System.out.println("file created " +a);
	}

}
