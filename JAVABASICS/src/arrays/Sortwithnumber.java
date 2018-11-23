package arrays;

import java.util.Scanner;

public class Sortwithnumber {

	public static void main(String[] args) 
	{
		//declare a static array of size 5
			int s[]=new int[5];
		
		//fill the static array with values
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<5;i++)
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
			s[i]=sc.nextInt();
		}
	
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<4;j++)
			{
				if(s[j]>s[j+1])
				{	
					int temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				
				}
		}
	}

for(int i=0;i<5;i++)
{
	System.out.println(s[i]+ " ");
}
	
	}
}
