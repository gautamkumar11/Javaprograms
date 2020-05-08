import java.io.*;
public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="F:/new folder/filehandling/gautam.txt";
		String data="";
		FileReader filereader=new FileReader(path);
		int read=filereader.read();
		while(read!=-1)
		{
			char c=(char)read;
			data= data + c;
			System.out.println(c);
			read=filereader.read();
		}
		System.out.println(data);
		filereader.close();
	}

}
