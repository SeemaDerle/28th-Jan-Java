package Interface_ImplementationClass;
//implementation class 
//example of multiple inheritance using interface
public class Sample implements I1, I2
{
public void m1() 
{
System.out.println("method m1 from I1 completed IC");
}
public void m2() 
{
System.out.println("method m2 from I1 completed IC");
}
public void m3() 
{
System.out.println("method m3 from I2 completed IC");
}
public void m4() 
{
System.out.println("method m4 from I2 completed IC");
}
}
