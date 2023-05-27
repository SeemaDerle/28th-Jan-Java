package nonstatic_method;
public class sample13
{
public static void main(String[] args) 
{
	System.out.println("night");
	sample13 A3=new sample13();
	A3.k6();
}
public void k6()
{
	System.out.println("running nonstatic regular method:k6 from same class");
}
}
