package constructor;

public class sample1
{
   //example1:default constructor
	
	// default constructor-->provided by complier
	//use:to copy/load all the members of class into object
	// sample()
	//{
	//
	//}
	
	public static void main(String[] args)
	{
		sample1 s1=new sample1();  //default constructor call from same class
		
		s1.m1();
		s1.m2();
		
		//1:sample1-->classname-->datatype
		//2:s1-->objectname-->to identify/refer object
		//3:new-->keyword-->use to create empty/blank object
		//sample1()-->classname()-->constructor call
		
		System.out.println("--------");
		
		sample2 s2=new sample2();   //default constructor call from diff class
		
		s2.m3();
		s2.m3();
	}
	public void m1()
	{
		System.out.println("running method m1");
	}
	public void m2()
	{
		System.out.println("running method m2");
	}
}
