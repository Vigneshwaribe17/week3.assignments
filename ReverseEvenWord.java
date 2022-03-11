package week3.day1;

public class ReverseEvenWord {
	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		
		String str[] = test.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(str[i]+" ");
			}
			else
			{
				char[] array = str[i].toCharArray();
			
				for(int j=array.length-1;j>=0;j--)
				{
					
					System.out.print(array[j]);
				}
				System.out.print(" ");
		}
		
	
		
	}}

}
