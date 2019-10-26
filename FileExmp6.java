//readline() method in file handling
import java.io.*;
public class FileExmp6
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("file1.txt"));
		String s1;
		s1 = bf.readLine();
		System.out.println(s1);
		bf.close();
	}
}