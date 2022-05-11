package Assignment_01;
class D
{
	int sum(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		if(a<b) return 0;
		return a-b;
	}
}
public class Q11 {

	public static void main(String[] args) {
		D d=new D();
		int a=2,b=3;
		int result=(a>b)? d.sum(a, b):d.sub(a, b);
		System.out.println(result);
		
	}

}