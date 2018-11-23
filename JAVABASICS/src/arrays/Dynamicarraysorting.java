package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamicarraysorting {

	public static void main(String[] args)
	{
			//declare a dynamic array
			ArrayList<String> x=new ArrayList();
		
			//store the values in dynamic array

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n= Integer.parseInt(sc.nextLine()); 
	
			for (int i=0;i<n;i++)
			{
				switch(i+1)
				{
				case 1:
					System.out.println("Enter 1st input");
					break;
				case 2:
					System.out.println("Enter 2nd input");
					break;
				case 3:
					System.out.println("Enter 3rd input");
					break;
				default:
					System.out.println("Enter"  +(i+1)+"th input");
				}
				x.add(sc.nextLine());
			}
		//sorting
			for(int i=0;i<n;i++)
			{
				for (int j=0;j<(n-1);j++)
				{
					if(x.get(j).compareToIgnoreCase(x.get(j+1))>0)
					{
						String temp=x.get(j);
						x.set(j,x.get(j+1));
						x.set(j+1,temp);
					}
				}

			}
	for(int i=0;i<n;i++)
	{
		System.out.println(x.get(i)+ " ");
	}
			
	}

}
