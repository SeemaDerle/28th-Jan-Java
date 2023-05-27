package nonstatic_method;

public class sample1
{
public static void main(String[] args) 
{
	System.out.println("hii");
	sample1 A2=new sample1();
	A2.m1();
	A2.m2();
	
}
public void m1()
{
	System.out.println("running nonstatic regular method:m1");
}
public void m2()
{
	System.out.println("running nonstatic regular method:m2");
}
}

