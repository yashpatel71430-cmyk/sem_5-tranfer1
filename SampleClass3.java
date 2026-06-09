class Maths
{
	//Overloading of static Methods
	static void show() //class methods
	{
		System.out.println("Hello User ");
	}

	static void show(String st) //class methods
	{
		System.out.println("Hello  "+ st);
	}
	void check() //object or instance method
	{
	System.out.println("I am checking ");	
	}
}
//static methods are also known as class methods
//non-static methods are also known as object or instance methods

class SampleClass3
{
	public static void main(String args[]) 
	{
		Maths.show();
		Maths.show("Neel");
		//Maths.check();
		Maths m1=new Maths();
		m1.check();
		m1.show();
		m1.show("Intellect ");
	}
}