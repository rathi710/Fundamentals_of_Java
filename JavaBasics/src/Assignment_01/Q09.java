package Assignment_01;
class Animals{
	private int a=10;
	protected int b=20;
	public int c=50;
	public void method1()
	{
		System.out.println("hello");
	}
}
public class Q09 extends Animals{

	public static void main(String[] args) {
		Animals species=new Animals();
		System.out.println(species.a);//private is not accessible outside the class
		System.out.println(species.b);//after extending class Animals b is accessible
		System.out.println(species.c);
		
	}

}