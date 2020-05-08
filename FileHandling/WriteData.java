import java.io.*;

public class WriteData {
	public static void main(String[] args) throws IOException
	{
		String path="F:/new folder/filehandling/gautam.txt";
		FileWriter filewriter= new FileWriter(path);
		String str="Hello I am Gautam Kumar.";
		filewriter.write(str);
		filewriter.flush();
		filewriter.close();
		
	}

}
