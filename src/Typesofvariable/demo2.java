package Typesofvariable;

public class demo2 
{
     //example2:static global variable
	static int a=10;      //static-->global variable
	public static void main(String[] args) 
	{
		 //1:static global variable call from same class -->variablename
		System.out.println(a);   //10
		
		//2:static global variable call from diff class-->diffclassname.variablename
		System.out.println(demo3.b);
	}
	public static void m1()
	{
		System.out.println(a);
		
	}
	public void m2()
	{
		System.out.println(a);
	}
	
	
	
}

