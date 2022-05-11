package Assignment_01;


public class Q02 {

	public static void main(String[] args) {
		ABC a1=new ABC();
		ABC a2=new ABC();
		ABC a3=new ABC();
		a1.display();
		a2.display();
		a3.display();
		System.out.print("Total number of times display is called: "+ABC.c);
	}

}

class ABC
{
	static int c;
	void display()
	{
		++c;
		//System.out.println("Inside Dispaly"+c);
	}
}