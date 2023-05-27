package nonstatic_method;
public class sample7 
{
public static void main(String[] args)
{
	System.out.println("beautiful");
	sample7 U1=new sample7();
	U1.m8();
	U1.m6();
}

public void m8()
{
	System.out.println("running nonstatic regular method:m8 from same class");
}
public void m6()
{
	System.out.println("running nonstatic regular method:m6 from same class");
}
}
