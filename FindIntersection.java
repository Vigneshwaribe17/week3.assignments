package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
	
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		for(int i=0;i<list1.size();i++) {
			
			for(int j=0;j<list2.size();j++) {
				
				if(list1.get(i)==list2.get(j)) {
					
					System.out.println(list1.get(i));
				}
				
			}
		}
		
	}

}
