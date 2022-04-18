package Unit_02;

public class P10_Task01_OverloadingAndOverridingInJava {

	public static void main(String[] args) {
		OverloadingAndOverriding obj = new OverloadingAndOverriding();
		
		System.out.println("add() with 2 parameters");
		System.out.println(obj.add(4,6));
		
		System.out.println("add() with 3 parameters");
		System.out.println(obj.add(4,6,7));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(1,2));
		
	}
}

class OverloadingAndOverriding
{
	int add(int a, int b)
	{
		System.out.println("INSIDE OverloadingAndOverriding!");
		return a+b;
	}
	int add(int a, int b, int c)
	{
		System.out.println("INSIDE OverloadingAndOveriding!");
		return a+b+c;
	}
	
}
class InheritFirstOne extends OverloadingAndOverriding
{
	int add(int a, int b)
	{
		System.out.println("INSIDE InheritFirstOne!");
		return a+b+1;
	}
}