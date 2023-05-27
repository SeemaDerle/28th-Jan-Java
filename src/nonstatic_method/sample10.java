package nonstatic_method;

public class sample10
{
public static void main(String[] args) 
{
	System.out.println("LIFE IS BEAUTIFUL");
	sample10 D4=new sample10();
	D4.p1();
	D4.p1();
	
}
public void p1()
{
	System.out.println("running nonstatic regular method :p1 from same class");
}

}
