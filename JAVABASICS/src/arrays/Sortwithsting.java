package arrays;

import java.util.Scanner;

public class Sortwithsting {

	public static void main(String[] args) 
	{
		//declare a static array of size 5
		String s[]=new String[5];
		
		//store elements into static array
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter" +(i+1)+ "word");
			s[i]=sc.nextLine();
		}
		//sorting
			for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)                                                                                                                                                                                                                                                                                                      
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
				
			}
		}
	
		for(int i=0;i<5;i++)
		{
			System.out.println(s[i] +" ");
		}
	}

}
