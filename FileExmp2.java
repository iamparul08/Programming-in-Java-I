//writing to file using FileOutputStream
import java.io.*;
public class FileExmp2
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("./myfile.txt",true);
		String s = "TATA";
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
			fout.write(ch[i]);
		fout.close();
	}
}