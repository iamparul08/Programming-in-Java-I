//when specific string is needed from a paragraph
import java.io.*;
public class FileExmp8
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(FileReader("file1.txt"));
		char[]s = new char[20];
		bf.read(s,2,4); // here s is character array, 2 is offset and 4 is length
		System.out.println(s);
		bf.close();
	}
}