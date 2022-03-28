package Unit_01;
/*
 * Keywords In Java
 * 		Special words having special meaning reserved by a programming language.
 *  	50 such Keywords
 *  		* 48 used and 2 are reserved for future use(goto*,const*)
 *  
 *  Future use 1; goto*, const*;
 *  1.2V: assert*;
 *  1.4V: strictfp***
 *  5.0V: enum****
 *  
 *  Keywords cannot be used as Identifiers in java
 *  objects
 *  class names
 *  variable name
 *  function
 *  etc. 
 */
public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		//using keyword as a variable name
		float int =1.5;
		//Syntax error on token "int", invalid Variable Declaration
		
		//using keyword as an object
		SampleClass int=new SampleClass();
		//Error "int" cannot be used as an object name;
	}
}

class SampleClass{
	void int() {		//Error identifier expected "int" cannot be used as a function name
		System.out.println("keywords");

	}
};


//Using keyword as a class name
class double{
	//error arises
};