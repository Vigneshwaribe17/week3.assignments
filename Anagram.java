package week3.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String str1 ="stops";
		String str2="posts";
		
		int str1len=str1.length();
		int str2len=str2.length();
		
		if(str1len==str2len)
		{
			char[] array1 = str1.toCharArray();
			char[] array2= str2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1,array2))
			{
				System.out.println("The texts are Anagram");
			}
			else
				System.out.println("Not Anagram");
		
		}
	}

}
