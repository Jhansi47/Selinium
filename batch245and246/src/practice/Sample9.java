package practice;

public class Sample9
{
	//Properties
	public int x;
	//constructor methods
	private Sample9()
	{
		x=10;
	}
	//Operational methods
	public static Sample9 create()
	{
		Sample9 obj=new Sample9();
		return(obj);
	}
	public void display()
	{
		System.out.println(x);
	}
}





