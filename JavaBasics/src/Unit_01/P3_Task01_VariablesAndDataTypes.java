package Unit_01;

/* 
-Variables in Java is a data container that saves the data values during Java program execute.

 Types of variables :
 -In Java , there are three types of variables :
 
 .Local Variables - declared inside the body of a method
 
 .Instance Variables - they are defined without the STATIC keyword.
  - They are defined outside a method declaration.
  - They are object specific and are known as instance variables.
  
 . Static Variables - they are defined with the STATIC keyword.
     - They are initialized only once , at the start of the program execution.
     - These static variables should be initialized first , before the initialization of any
     
Data Types In Java       
 */

public class P3_Task01_VariablesAndDataTypes {
	
	static int q = 11;
	  int p = 10;

	public static void main(String[] args) {
		
		//Valid Declarations
		   int a , b , c;
		   float pi;
		   double d;
		   char e;
		   
		  //Valid Initialization 
		   pi = 3.14f;
		   d = 20.22d;
		   e = 'v';
		   
		   a = 10;
		   b = 10;
		   c = 10;
		   
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
		   
		   System.out.println(pi);
		   System.out.println(d);
		   System.out.println(e);
		   
		   int myNum = 5 ; // Integer (Whole Number)
		   float myFloatNum = 5.99f ;// Floating Point Number
		   char myLetter = 'D'; //Character
		   boolean myBool = true; //Boolean
		   String myText = "Hello"; //String 
		   
		   System.out.println(myNum);
		   System.out.println(myFloatNum);
		   System.out.println(myLetter);
		   System.out.println(myBool);
		   System.out.println(myText);
		   
		   /* 
		    * Java Variables Type Conversion & Type Casting 
		    */
		   
		   double f;
		   int i = 10;
		   f = i ; // Type Conversion 
		   
		   double g;
		   int j = 10;
		   g = (int)j ; // Type Casting 
		   
		   System.out.println(f);
		   System.out.println(i);
		   System.out.println(g);
		   System.out.println(j);
		   
		   byte k = 10; // 1 byte
		   boolean l = true ; // 1 bit = true or false only 
		   long m =  10L;
		   float n = 1.2f;
		   double o = 1.2d;
		   
		   System.out.println(k);
		   System.out.println(l);
		   System.out.println(m);
		   System.out.println(n);
		   System.out.println(o);
		   
		   System.out.println(ABCD.j); //data functions / methods
		   //ABC.display();
		   
		   ABCD obj1 = new ABCD();
		   System.out.println(obj1.i++);
		   System.out.println(obj1.i);
		   
		   ABCD obj2 = new ABCD();
		   System.out.println(obj2.i);
		   
		   // System.out.println(obj1.j++);
		   //System.out.println(obj1.j);
		   //System.out.println(obj2.j);
		   
		 System.out.println(ABCD.j++);  
		 System.out.println(ABCD.j);
		 
		 ABCD.typeConversionAndTypeCasting();
	}

	 int r = 10;
	 
	 void display() {
		 int a = 5; //local variable
		 System.out.println("This is Display Method ! ");
		 System.out.println(a);
	 }
}

class ABCD{
	
	static int j = 10; //class variable / static variable
	int i = 10; //Instance Variable
	
	static void display() {
		int a = 5;
		System.out.println("this is display method ");
		 System.out.println(a);
	}
	 
	 static void typeConversionAndTypeCasting() {
		 double f; //64 slots
		 int i =10; // 32 slots
		 f = i; // type conversion
		 System.out.println(f);
		 
		 double g=10; //64 slots
		 int j; // 32 slots
		 j = (int)g; // type casting
		 System.out.println(i);
		 System.out.println(j);
	 }
}