package Unit_02;

public class P13_Assignment_Question_Unit_02 {

	public static void main(String[] args) {
		Assignment_Questions_Unit_02 obj = new Assignment_Questions_Unit_02();
		obj.abstractClassCall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		obj.InterfaceImplementation();

	}

}

class Assignment_Questions_Unit_02{
	void abstractClassCall() {
		Sample3 obj = new Sample3();
		obj.run();
		
	}
	
	void overloadingAndOverriding() {
		
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1, 2);
		
		obj.display();
		
	}
	
	void accessProtectionInJava() {
		
		Sample3 obj = new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
		
	}
	
	void InterfaceImplementation() {
		
		Sample3 obj = new Sample3();
		
		obj.display1();
		obj.display2();
		
	}
}


abstract class Sample2 {
	int a = 10 ;               // default protection
	public int b = 20;         // can be accessed outside Unit02 package but within same project
	protected int c = 30;      // can only be accesed within Unit_02 package.
	private int d;             // can be accesed within parent class only.
	
	void showData() {
		System.out.println("Inside Sample2 parent class");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}
	
	public void display() {
		System.out.println("This is display method inside abstract class Sample2");
	}
	
	abstract void run();         // Unimplemented method 
	
}

class Sample3 extends Sample2 implements A3, B3{
	
	public void display() {
		
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		System.out.println("d = " + d);                  // d cannot be accessed as it is a private member. 
		
	}
	
	public void display1() {
		System.out.println("This is display1 method in chile class Sample3 from interface");
	}
	
	public void display2(){
		System.out.println("This is display2 method in chile class Sample3 from interface");
	}
	
	public void run() {
		System.out.println("This is a run method from abstract class sample3! ");
	}

	public void run(int x) {
		System.out.println("This is a run overloaded method with one parameter in sample3! ");
	}
	
	public void run(int x, int y) {
		System.out.println("This is a run overloaded method with two parameters in sample3! ");
	}	
	
}

interface A3{
	
	public void display1();
}

interface B3{
	
	public void display2();
}