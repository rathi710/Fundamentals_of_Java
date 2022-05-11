package Assignment_01;

/*
 * What happens if we add final keyword with Class, Method and a variable in java. Explain it through suitable code if required.
 * Ans. If we add final keyword ina a class then it mens that  there will be no class inheriting this class.
 * No class can inherit the contents of this class.
 * The main purpose of using a class being declared as final is to prevent the class from being used.
 *  -If a class is marked as final then no class can inherit any feature from final class.
 *  -you cannot extend a final class.If you try it gives you a compile time error.
 */
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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