package Unit_01;
import java.util.Scanner;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		System.out.println("Array elements after sorting:");  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.println(arr[i]);  
		}
	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		 System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		for(int i=0;i<arr.length;i++)     //Use to hold the element
        {
            for(int j=i+1;j<arr.length;j++)    //Use to compare with the rest of the elements 
            {
                if(arr[i]<arr[j])     //Check and swap
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println("Second Largest element is "+arr[1]);   //Display second largest element.
        System.out.println("Second Smallest element is "+arr[arr.length-2]);
		

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int n=arr.length;
		 for(int i = 0; i < n; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                //Shift element of array by one  
	                arr[j] = arr[j+1];  
	            }  
	            //First element of array will be added to the end  
	            arr[j] = first;  
	        }  
	        System.out.println();  
	        //Displays resulting array after rotation  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.println(arr[i] + " ");  
	        }  

	}

	void removeElementInArray(int[] arr) {
		// write code here!
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Element to be deleted: ");
	    int element = in.nextInt();
	    
	    for(int i = 0; i < arr.length; i++){
	      if(arr[i] == element){
	        // shift elements to the left
	        for(int j = i; j < arr.length - 1; j++){
	          arr[j] = arr[j+1];
	        }
	        break;
	      }
	    }
	    
	    System.out.println("Array elements after deletion-- " );
	    for(int i = 0; i < arr.length; i++){
	        System.out.print(" " + arr[i]);
	      }  

	}

}