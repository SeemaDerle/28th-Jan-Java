package method_withparameter;

public class sample10 
{
public static void main(String[] args) 
{
	studentname("priyanka");
	studentname("amol");
	  
	System.out.println("----");
	
	studentfullname("abc","xyz");
	studentfullname("abc1","xyz1");
	
	System.out.println(".....");
	
	sample11.studentinfo("kuldeep",101,65.6f,'A');
	
}
public static void studentname(String s1) 
{
	System.out.println(s1);
}
public static void studentfullname(String fname,String lname)
{
	System.out.println(fname+" "+lname);
}
}
