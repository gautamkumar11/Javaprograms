import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="F:/new folder/filehandling";
		File file=new File(path);
		boolean a=file.mkdir();
		System.out.println("folder created " +a);

	}

}
