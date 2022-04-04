package Unit_01;

/*
 * Java provides three types of control flow statements.
 * -Decision making statements:
 *    -if statements
 *    -switch statements
 *    
 *-Loop Statements
 *  -do while Loop
 *  -while Loop
 *  -for Loop
 *  -for-each Loop
 *  
 * -Jump Statements
 *   -break statement 
 *   -continue statement 
 */

public class P4_Task01_ControlsAndConditionalStatementsInJava {

	public static void main(String[] args) {
		
Statements obj=new Statements();
		
		obj.DecisionMakingStatements(); //objects are created to access the classes
		obj.LoopStatements();
		obj.JumpStatements();
		}
}

class Statements
{
  void DecisionMakingStatements()
  {
	  int x=10;
	  int y=12;
	  if(x+y<10)
	  {
		  
		  System.out.println("x+y is less than 10");
	  }
	  else
	  {
		  System.out.println("x+y is greater than 10"); 
	  }
	  int num=2;
	  //
	  switch(num) //switch (expression) 
	  {
	  case 0: //Case value 1
		  System.out.println("Number is 0");
		  break;//if break is not used all the statements after that are executed
	  case 1:
		  System.out.println("Number is 1");
		  break;
	  default:
		  System.out.println(num);
	  
	  }
	  
 }
void LoopStatements()
{
	int sum=0;
	for(int i=0;i<=10;i++)
	{
		sum+=i;	
	}
	System.out.println("The sum of first n natural number is" + sum); //concatenation is done to print the value of sum along with the written statement
	
	String[] names= {"Java","C","Python","Javascript","R"};
	System.out.println("Printing the contents of array names:\n");
	
	//For-each loop
	for(String name:names)
	{
		System.out.println(name); //name is the variable used for accessing all the values of our string "names"
		
	}
	int i=0;
	System.out.println("Printing the list of first 10 even numbers");
	while(i<=10)
	{
		System.out.println(i);
		i=i+2;
		
	}
    i=0; //assigning value again to i so that it can be used for do-while loop 
    System.out.println("Printing the list of first 10 even numbers\n");
    do {
    	System.out.println(i);
    	i=i+2;
    }while(i<=10);
}
void JumpStatements()
{
	//Break statement will terminate the loop as soon as the condition holds true
for(int i=0;i<=10;i++)
	{
	System.out.println(i);
	if(i==6)
	{
		break;
	}
System.out.println(i);
}
   //Continue statement will exclude/skip the conditional value and rest of the values are printed 
for(int i=0;i<=10;i++)
      {
      System.out.println(i);
      if(i==6)
      {
    	  continue;

      }
      System.out.println(i);
      }
	}
}