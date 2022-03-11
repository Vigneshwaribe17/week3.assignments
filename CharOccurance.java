package week3.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		// declare and initialize a variable count to store the number of occurrences
		int count =0;
		
					// convert the string into char array
		char[] array=str.toCharArray();
		int len = array.length;
		
						
					//get the length of the array
		for(int i=0;i<len;i++)
		{
			if(array[i]==str.charAt(i))
				count=count+1;
			
		}
						
		System.out.println(count);
					
	}

}
