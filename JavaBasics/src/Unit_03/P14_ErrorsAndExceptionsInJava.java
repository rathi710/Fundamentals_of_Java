package Unit_03;
import java.util.*;


//Throw keyword is used when you want to create your own exception
/*
 * Exceptions can be handled while errors can't be handled
 * the code which can generate exception is put into try block which is then catch after
 * we can use numerous catch block but the exception can be caught only by correct catch block
 */
public class P14_ErrorsAndExceptionsInJava {

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
//the finally keyword lets you execute code,after try.....catch regardless of the results
	//agar catch na bhi ho tbhi bhi finally chalega chahe exception terminate ho jaye

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
	
	       
		//error:no handling of this 
		void stackoverflowException()
		{
			try {
				if(a>0) {
					a++;
					stackoverflowException();
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("done");
		}
		
		void IndexOutofBound()
		{
			try {
				int a[]= {1,2,3};
				System.out.println(a[4]);
				
			}
			catch(Exception e){
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
		void useofThrow(int age)throws Exception//LAzy Exception does not want to use its own try /catch
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
		void voting(int age) throws ManualException {

			if (age < 17) {
				throw new ManualException();
			}

			
			System.out.println("you can vote");

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
