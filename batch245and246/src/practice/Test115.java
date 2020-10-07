package practice;

public class Test115
{
	public static void main(String[] args)
	{
		Splendor obj1= new Splendor();//own-casting
	    obj1.run();  //run() method in Splendor
	    Bike obj2= new Bike();//own-casting 
	    obj2.run();  //run() method in Bike class
	    Bike obj3= new Splendor(); //up-casting
	    obj3.run(); //run() method of Splendor(child class) due to run() method overriding
	    Bike obj4= new Splendor();
	    Splendor obj5=(Splendor) obj4; //down-casting (dynamic binding)
	    obj5.run(); //run() method of Splendor class
	}
}




