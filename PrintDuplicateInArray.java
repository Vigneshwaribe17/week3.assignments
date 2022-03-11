package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicateInArray {
	
public static void main(String[] args) {
		
	List<Integer> arr = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
	
	int length = arr.size();
	int count =0;
	
	for(int i=0;i<length;i++) {
		
		for(int j=i+1;j<length-1;j++)
		{
			if(arr.get(i).equals(arr.get(j))) 
				{count = count+1;	
			
			
			System.out.println(arr.get(i));	}
		}	
		
	}
	System.out.println(count);
	
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
			
			
		
	}

}
