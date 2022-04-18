package Unit_02;

public class P11_Task01_AccessProtectionInJava {

	public int a = 10;
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.showData();
		obj.accessData();
	}
}

class ParentClass
{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData()
	{
		System.out.println("Inside Parent Class");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
}

class ChildClass extends ParentClass
{
	void accessData()
	{
		System.out.println("INSIDE ChildClass");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		//System.out.println("d = "+d); // private members can't be accessed outside the class scope
	}
}
class AnotherClass
{
	void display()
	{
		ParentClass obj = new ParentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}