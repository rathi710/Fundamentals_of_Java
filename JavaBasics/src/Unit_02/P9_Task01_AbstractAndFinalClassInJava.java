package Unit_02;
/*
 * Abstract Class:
 * -An Abstract class must declared with an abstract keyword
 * 
 * - Abstracting is a process of hiding the implementation details
 * and showing only functionality (function declaration) to the user.
 * -cannot make object of abstract class directly,but through derived class [cannot be instance]
 * 
 *  -Example of abstract method?
 *  -Abstract Class may contain abstract and non-abstract
 *  (0-100%) abstract methods can be there:
 *  
 *  In class of Inheritance :100% abstract methods should be there:
 *  First Class:
 *  The main purpose of using a class being declared as final is to prevent the class from being used.
 *  -If a class is marked as final then no class can inherit any feature from final class.
 *  -you cannot extend a final class.If you try it gives you a compile time error.
 */ 

abstract class Bike
{
	int a;
	Bike()
	{
		System.out.println("Inside Bike Constructor : "+a+"\n");
	}
	
	abstract void run();
	
	void display()
	{
		System.out.println("This is display method!");
	}
}
class Honda4 extends Bike
{
	void run()
	{
		
	}
}
public class P9_Task01_AbstractAndFinalClassInJava {
	public static void main(String args[])
	{
		Bike obj = new Honda4();
		obj.display();
		Super obj2 = new Super();
	    obj2.display();
	}
}
final class Super
{
	public int data = 30;
	
	void display()
	{
		System.out.println(data);
	}
}
/*public class Sub extends Super
{
	void display2()
	{
		display();
	}
}*/