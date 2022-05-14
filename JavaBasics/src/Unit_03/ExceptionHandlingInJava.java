package Unit_03;
import java.util.*;
public class ExceptionHandlingInJava {

	public static void main(String[] args) {
		A obj = new A();
//		obj.ArithmeticException();
//		obj.stackOverflowError(2);
//		obj.nullPointerException();
//		obj.IndexOutofBound();
//		obj.inputMismatchException();
//		obj.useofThrows_and_finally();
//		obj.checkedAndUncheckedException();
//		obj.manualExceptionThrow();
		
	}

}

class A{
	
	void ArithmeticException() {
		try {
			//sensitive code
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		
		catch(Exception e) {    //super class for exceptions
			System.out.println(e.getMessage());
		}
		
//		catch(ArithmeticException e)         //unreachable code(already handled by super class above)
		{      
//			System.out.println(e.getMessage());
//		}
		System.out.println("done");
	}
	
	void stackOverflowError(int a) {       //error:no handling of this 
		try {
			if(a>0) {
				a++;
				stackOverflowError(a);
			}
		}
		catch(Exception e) {
				System.out.println(e.getMessage());
		}   
	}
	
	void nullPointerException() 
	{
		try {
			String s=new String();
			s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void IndexOutofBound() {
		try {
			int a[]= {1,2,3};
			System.out.println(a[4]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void inputMismatchException()
	 {
	  Scanner s=new Scanner(System.in);
	  
	  try {
		  int a=s.nextInt();
		  System.out.println(a);
		  s.close();
	  }
	  
	  catch(InputMismatchException e){
		  System.out.println(e.getMessage());
	  }
	  
	  System.out.println("done");
	 }
	
	void useofThrow(int age) throws Exception //LAzy Exception(wont use its own try/catch
	{
	  if(age<18)
		  throw new Exception();
	  else
		  System.out.println("You are allowed to Vote");
	}
	
	void useofThrows_and_finally() {
		 try {
			 useofThrow(17);
		 }
		 catch(Exception e){
			 e.printStackTrace();
	  }
		 
		 finally {
			 System.out.println("The try block is finished");
		 }
    }
	
	void checkedAndUncheckedException() {

		  /*
		   * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		   * will not be caught at compile time */
		
		  int x = 0;
		  int y = 10;
		  int z = y / x;

		  System.out.println(z);

		  // Checked Exception [Run this code over terminal and check compiler error]
		  
		  try {
			  useofThrow(19);
		  } 
		  catch (Exception e) {
			  e.printStackTrace();
		  }

		 }

		 void manualExceptionThrow() {

		  try {

		   // Have to use try and Catch here!
		   age(14);
		  } catch (ManualException e) {
		   System.out.println(e.getMessage());
		  }

		 }

		 void age(int r) throws ManualException {

		  if (r < 18) {
		   throw new ManualException();
		  }

		  System.out.println("you are eligible");

		 }

		}

//		@SuppressWarnings("serial")
		class ManualException extends Exception {

		 @Override
		 public String getMessage() {
		  String detailMessage = "Exception Occured!";
		  return detailMessage;
		 }

		}
}
