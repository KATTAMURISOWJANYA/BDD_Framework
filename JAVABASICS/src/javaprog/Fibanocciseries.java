package javaprog;

import java.util.Scanner;

public class Fibanocciseries
{

	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the limit");
			int l=sc.nextInt();
			
			int x=0;
			int y=1;
			System.out.println(x+ " " +y+ " ");
			int z=x+y;
			
			while(z<=l)
			{
					System.out.print(z+ " ");
					x=y;
					y=z;
					z=x+y;
					
			}
	}

}
