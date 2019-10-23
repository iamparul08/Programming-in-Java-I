//1. File class
import java.io.File;
import java.io.IOException;
class FileExmp1
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("c:/javaP/name1.txt");
		f1.createNewFile();
		//System.out.println("Is file exist"+f1.exist());
		System.out.println("File Name"+f1.getName());
		System.out.println("Length of file is "+f1.length());
	}
}