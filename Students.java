package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The id is "+id);
		
	}
	public void getStudentInfo(String name,String email,int phno) {
		
		System.out.println("Name"+name);
		System.out.println("Email"+email);
		System.out.println("Phone number"+phno);
	}
	public static void main(String[] args) {
		
		Students obj=new Students();
	obj.getStudentInfo(12345);	
	obj.getStudentInfo("Vigneshwari", "123@gmail.com", 123698547);
		

}}
