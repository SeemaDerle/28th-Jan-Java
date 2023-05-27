package Exceptionhandling;
public class example1
{
public static void main(String[] args)
{
String s1="abcd";
try
{
System.out.println(s1.charAt(5)); //riskycode
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("StringIndexOutOfBounds Exception handled");
}
System.out.println("Hi");
System.out.println("Hello");
}
}
