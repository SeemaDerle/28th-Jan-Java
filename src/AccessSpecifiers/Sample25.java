package AccessSpecifiers;
public class Sample25 
{
//example4: public access specifier
public int c;
public Sample25() 
{
c=50;
}
public void m1() 
{
System.out.println("running method");
}
public static void main(String[] args)
{
Sample25 s25=new Sample25();
s25.m1();
System.out.println(s25.c);
}
}
