package Unit_02;
/*
 * An Interface is a completely "abstract class"
 * that is used to group related models with empty bodies
 * 
 * -Need of interface?
 * multiple interface can be implemented at same time in one class
 */
interface Animal
{
	public void animalSound();
	public void run();
}

interface Human
{
	public void humanSound();//interface method does not have a body
	public void run1();
}

public class P12_Task01_InterfaceInJava implements Animal{

	public static void main(String[] args) 
	{
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
	}
	public void animalSound()
	{
		
	}
	public void run()
	{
		
	}
}
class Species implements Animal, Human
{
	public void animalSound()
	{
		System.out.println("INSIDE animalSound method");
	}
	
	public void run()
	{
		System.out.println("INSIDE run method");
	}
	public void humanSound()
	{
		System.out.println("INSIDE humanSound");
	}
	public void run1()
	{
		System.out.println("INSIDE run1 method");
	}
}

interface A1
{
	void funcA();
}

interface B1 extends A1
{
	void funcB();
}
class C1 implements B1
{
	public void funcA()
	{
		System.out.println("This is funcA from A1");
	}
	public void funcB()
	{
		System.out.println("This is funcB from A2");
	}
	
}