package sample1;

public class Sample11
{
	public int x;
	Sample11()
	{
		x=10;
	}
	
	public void display()
	{
		System.out.println(x);
	}
	
	public static Sample11 Create()

	{
		Sample11 obj=new Sample11();
		return(obj);
	}
}
