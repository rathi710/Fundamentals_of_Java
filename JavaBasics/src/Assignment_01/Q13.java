package Assignment_01;

/*
 *  How Compiler And Jvm Can Differentiate Constructor And Method Definitions Of Both Have Same Class Name? 
 *  Ans. By using return type , if there is a return type it is considered as a method else it is considered as constructor.
 */
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Am a=new Am();
		System.out.println(a.Am());
	}

}
class Am
{
	Am()
	{
		System.out.println("Cons.");
	}
	int Am()
	{
		return 1;
	}
}