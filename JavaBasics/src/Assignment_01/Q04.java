package Assignment_01;
class One
{
	One(int x)
	{
		System.out.println("Inside Class One");
	}
}
class Two extends One
{
	
	Two()
	{
		super(1);
		System.out.println("Inside Class Two");
	}
}
class Three extends Two
{
	Three()
	{
		System.out.println("Inside Class Three default");
	}
	Three(int x)
	{
		System.out.println("Inside Class Three parameterized");
	}
}
public class Q04 {

	public static void main(String[] args) {
		Three obj=new Three(1);
		Three obj1=new Three();

	}

}