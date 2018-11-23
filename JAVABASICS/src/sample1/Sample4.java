package sample1;

public class Sample4 
{
			//data members
			public int x;
			public float y;
			public char z;
			public boolean w;
			public String s;
			
			//polymorphism
			//constructor method with arguments
			public Sample4()
			{
				x=10;
				s="sowjanya";
			}
	
			//constructor method with arguments
			public Sample4(String temp)
				{
					x=10;
					s=temp;
				}
		
			//method
			public void display()
				{
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println(w);
				System.out.println(s);		
				}
}
