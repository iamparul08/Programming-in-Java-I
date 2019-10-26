//when whole paragraph has to be read
import java.io.*;
public class FileExmp7
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("file1.txt"));
		String s1;
		while((s1=bf.readLine())!=null)
			System.out.println(s1);
		bf.close();
	}
}
