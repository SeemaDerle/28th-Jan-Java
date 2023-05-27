package Exceptionhandling;
public class example5
{
public static void main(String[] args)
{
String s1="abcd";
try
{
System.out.println(s1.charAt(5)); //risky code
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("generic exception handled");
}
System.out.println("Hi");  
System.out.println("Hello");
}
}
