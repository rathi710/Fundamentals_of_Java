package Assignment_01;

/*
 *  If We Place Return Type In Constructor Prototype Will It Leads To Error? 
 *  Ans. No, because compiler and JVM considers it as a method.
 */

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println(a.A());
	}

}
class A
{
	int A()
	{
		return 1;//Here it has been considered as a method
	}
}