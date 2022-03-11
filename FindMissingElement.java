package week3.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
	public static void main(String[] args) {
		
		// Here is the input
				List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));

				// Sort the array	
				Collections.sort(arr);
				
				for(int i=0;i<arr.size();i++) {
					
					if(arr.get(i)!=(i+1)) {
						System.out.println("THe Missing number is " +(i+1));
						break;
					}
				}
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
	}

}
