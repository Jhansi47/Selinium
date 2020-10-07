package practice;

public class Test102
{
	//Declare properties
	public int x;
	public int y;
	public float z;
	//Define methods
	public void add()
	{
		z=x+y;
	}
	public void substract()
	{
		z=x-y;
	}
	public void multiply()
	{
		z=x*y;
	}
	public void divide()
	{
		z=(float)x/y; //get output in float value
	}
	public static void main(String[] args)
	{
		//Declare object to class
		Test102 obj=new Test102();
		obj.x=10;
		obj.y=20;
		obj.add();
		System.out.println(obj.z);
		obj.substract();
		System.out.println(obj.z);
		obj.multiply();
		System.out.println(obj.z);
		obj.divide();
		System.out.println(obj.z);
	}
}






