package day2;
import java.util.*;
public class a2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[][] array = new String[3][3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("person");
            for (int j = 0; j < 7; j++) {
                System.out.print("Enter attendance P or A");
                array[i][j] = sc.next();
            }
        }
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
