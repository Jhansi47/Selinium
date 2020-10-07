package practice;

public class Sample4 
{
	//Properties or data members
	public int x;
	public int y;
	//Constructor methods overloading
	public Sample4()
	{
		x=10;
		y=20;
	}
	public Sample4(int a)
	{
		x=a;
		y=20;
	}
	public Sample4(int a,int b)
	{
		x=a;
		y=b;
	}
	//Operational methods overloading
	public void addition()
	{
		System.out.println(x+y);
	}
	public void addition(int a)
	{
		System.out.println(x+y+a);
	}
	public void addition(float a)
	{
		System.out.println(x+y+a);
	}
}






