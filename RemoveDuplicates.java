package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		
		String text = "We learn java basics as part of java sessions in java week1";	
		String str[] = text.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(str));
		
		for(int i=0;i<list.size();i++) {
			
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j)))
						
					list.remove(j);
					
			}
			System.out.print(list.get(i)+" ");
		}
		
		
	}
	
	

}
