package Exceptionhandling;
public class example2
{
public static void main(String[] args)
{
int [] ar= {40,20,10,30};
try
{
System.out.println(ar[9]); //risky code
}
catch(ArithmeticException s1)
{
System.out.println(ar[0]); //alternate soln
System.out.println("ArrayIndexOutOfBounds Exception handled");
}
System.out.println("good night");
}
}
