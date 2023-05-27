package Exceptionhandling;
public class example8
{
public static void main(String[] args)
{
String s1="abcd";
int [] ar= {40,20,10,30};
try
{
try //nested try block
{
System.out.println(s1.charAt(5)); 
//risky code1
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("StringIndexOutOfBounds Exception handled");
}
System.out.println(ar[9]); //riskycode//risky code 2
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("ArrayIndexOutOfBounds Exception handled");
}
System.out.println("Hi");
System.out.println("hello");
}
}
