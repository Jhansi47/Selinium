package practice;

public class Test112 
{
	public static void main(String[] args)
	{
		Sample10 obj1=new Sample10();
		System.out.println(obj1.x);
		Sample10.Sample11 obj2=obj1.new Sample11();
		System.out.println(obj2.y);
	}
}










