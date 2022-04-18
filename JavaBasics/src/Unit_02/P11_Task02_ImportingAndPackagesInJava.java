package Unit_02;

/*
 * A Java package is a group of similar types of classes , interfaces and sub-packages
 * -Package in Java can be categorised in two form
 * 		-built in (lang,awt,javax,swing,net,util,sgl)
 * 		-User defined
 * 
 * Packages also helps to avoid name collisions
 * Packages also helps to maintain access protection in Java 
 * Are named in reverse order of domain names
 * unit1.java.com ----> com.java.unnit1
 * 
 */
import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.P3_Task01_VariablesAndDataTypes;
import Unit_01.P3_Task01_VariablesAndDataTypes;
public class P11_Task02_ImportingAndPackagesInJava {
	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		
		out.println(sqrt(4));               // Use of "out"
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));
		
		P3_Task01_VariablesAndDataTypes obj = new P3_Task01_VariablesAndDataTypes();
		obj.x();
		
	}
}