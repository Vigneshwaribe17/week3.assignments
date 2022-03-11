package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLargestNumber {
	public static void main(String[] args) {
		// Here is the input
				List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
				Collections.sort(list);
				System.out.println("The Sorted list is "+list);
				int count = list.size();
				System.out.println("The Second largest list is "+list.get(count-2));
				

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
	}

}
