package nonstatic_method;
public class sample4
{
public static void main(String[] args) 
{
	System.out.println("morning");
	sample4 A7=new sample4();
	A7.m4();
	A7.m5();
}
public void m4()
{
	System.out.println("running nonstatic regular method:m4 from same class");
}
public void m5()
{
	System.out.println("running nonstatic regular method:m5 from same class");
}
}
