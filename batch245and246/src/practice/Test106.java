package practice;

public class Test106
{
	public static void main(String[] args)
	{
		//Create objects to class
		Sample3 obj1=new Sample3(); //1st constructor should be executed
		System.out.println(obj1.x);  //10
		System.out.println(obj1.y); //default 
		System.out.println(obj1.z); //default
		System.out.println(obj1.w); //default
		System.out.println(obj1.b); //true
		Sample3 obj2=new Sample3(45); //2nd constructor should be executed
		System.out.println(obj2.x);  //45
		System.out.println(obj2.y); //default 
		System.out.println(obj2.z); //default
		System.out.println(obj2.w); //default
		System.out.println(obj2.b); //true
		Sample3 obj3=new Sample3(90,false); //3rd constructor should be executed
		System.out.println(obj3.x);  //90
		System.out.println(obj3.y); //default 
		System.out.println(obj3.z); //default
		System.out.println(obj3.w); //default
		System.out.println(obj3.b); //false
	}
}








