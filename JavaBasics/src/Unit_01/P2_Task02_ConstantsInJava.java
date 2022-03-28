package Unit_01;
/*
 *  Constants 
 *  	Piece of code/data that does not change its value
 *  	they never change the value once assigned
 *  private: INSIDE CLASS ONLY
 *  protected:CLASS + WITHIN THE PACKAGE
 *  public:CLASS + WITHIN THE PACKAGE +OUTSIDE THE PACKAGE
 *  Default:No Keyword ,Package private{ Not Outside the package }
 */
public class P2_Task02_ConstantsInJava {
	private static  final double Pi =3.14;
	public static void main(String[] args) {
		final int a=10;
		//a=11;
		//cannot make a single reference to the non static function
		System.out.println(Pi);
		System.out.println(a);
		add(1,2);
		multi(1,2);
		//with object you can tell non static members from static function
		Calculator obj=new Calculator();
		System.out.println(obj.add(1,2));
		System.out.println(obj.a);
	}
	static int add(int a,int b)
	{
		System.out.println(a);
		System.out.println(Pi);
		return (a+b);
	}
	static int multi(int a,int b)
	{
		return (a*b);
	}
}
class Calculator{
	int a=10;
	
	int add(int a,int b)
	{
		//System.out.println(Pi);
		return  (a+b);
	}
	int multi(int a,int b)
	{
		return (a*b);
	}
};