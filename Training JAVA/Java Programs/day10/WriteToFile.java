package day10;
//buffer
import java.io.*;
public class WriteToFile {
 
	public static void main(String[] args)
	{
 
		BufferedWriter writer=null;
		try {
		
	writer= new BufferedWriter(new FileWriter( "C:\\Users\\98668\\OneDrive\\Desktop\\test.txt", true));
		writer.write("Hello Learners  how ");
		writer.newLine();
		System.out.println("Successfully Written to file");
		}
		catch(IOException e)
		{
			System.out.println("An error occurred while writing to the file: "  +e.getMessage());
 
		}
		finally
		{
			try
			{
				if(writer !=null)
				 writer.close();
			}
			catch(IOException e)
			{
				System.out.println("Error while closing the writer: " +e.getMessage());
			}
		}
		}
	}
 
 
