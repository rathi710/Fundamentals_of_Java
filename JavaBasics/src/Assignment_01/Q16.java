package Assignment_01;
/*
 * Functional Interface
 */
interface i1{
	public void s();
}
class S implements i1{
	public void s()
	{
		System.out.println("Hello");
	}
}
//Marker interface 
interface i2
{
	
}
class W implements i2
{
	//Marker class
}

//Pure 100% Abstract class
abstract class AbsClass 
{ 
  // No abstract method here. 
} 
//Abstract class(0-100%)
abstract class Hello 
{ 
// Declaration of instance method. 
  public void msg1() 
  { 
    System.out.println("msg1-Hello"); 
  } 
  abstract public void msg2(); 
} 
class Test extends Hello 
{ 
// Overriding abstract method. 
  public void msg2() 
  { 
    System.out.println("msg2-Test"); 
  } 
}
class B extends AbsClass{
	
}
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}