package Assignment_01;
import java.util.Scanner;
interface In1{
	public void display(int p);
}
class testClass implements In1
{
	public void display(int n)
	{
		int flag=0;
		if (n <= 1)
            System.out.println("Not Prime");
 
        for (int i = 2; i < n; i++)
            if (n % i == 0)
            {
            	flag=1;
                System.out.println("Not Prime");
                break;
            }
        if(flag==0)
        	System.out.println("Prime");
        return;
	}
}
public class Q03 {

	public static void main(String[] args) {
		testClass t1=new testClass();
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		t1.display(n);

	}

}