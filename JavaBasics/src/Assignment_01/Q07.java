package Assignment_01;

public class Q07 {

	public static void main(String[] args) {
		ABCD a1=new ABCD();
		ABCD a2=new ABCD();
		ABCD a3=new ABCD();
		a1.display();
		a2.display();
		a3.display();
		System.out.print("Total number of times display is called: "+ABC.c);

	}

}
class ABCD
{
	static int c;
	void display()
	{
		++c;
		//System.out.println("Inside Dispaly"+c);
	}
}