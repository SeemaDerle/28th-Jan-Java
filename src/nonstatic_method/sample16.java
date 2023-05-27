package nonstatic_method;
public class sample16 
{
public static void main(String[] args) 
{
	System.out.println("morning");
	sample16 S8=new sample16();
	S8.o6();
	S8.o6();
	
}
public void o6()
{
	System.out.println("running nonstatic method:o6 from same class");
}
}
