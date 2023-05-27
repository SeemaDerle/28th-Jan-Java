package method_withparameter;

public class sample9
{
public static void main(String[] args)
{
	m1(10,20);
	m1(5,6);
	m1(50,3);
	
	System.out.println("---------");
	
	
	
	sample9 s9=new sample9();
	s9.m2(7, 6);
	s9.m2(4, 3);
	
}
public static void m1(int num1,int num2) 
{
	System.out.println(num1+num2);
}
public void m2(int num3,int num4) 
{
	System.out.println(num3*num4);
}
}
