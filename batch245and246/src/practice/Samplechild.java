package practice;

public class Samplechild extends Sampleparent
{
	//properties
	public int x;
	//Constructor method
	public Samplechild()
	{
		this.x=10;
		super.x=20;
	}
	//Operational method
	public void display()
	{
		System.out.println(this.x+" "+super.x);
	}
}



