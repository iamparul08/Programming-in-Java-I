//FileInputStream
import java.io.*;
public class FileExmp3
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fis = new FileInputStream("./myfile.txt");
		do{
			i = fis.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);
			fis.close();
	}
}