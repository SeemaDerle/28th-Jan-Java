package Exceptionhandling;
public class example4
{
public static void main(String[] args)
{
String s1="abcd";
  try
{
   System.out.println(s1.charAt(5)); //risky code
}
  catch(ArrayIndexOutOfBoundsException e1)
{
    System.out.println("ArrayIndexOutOfBounds Exception handled");
}
  catch(ArithmeticException e2)
{
    System.out.println("Arithmetic Exception handled");
}
  catch(StringIndexOutOfBoundsException e3)
{
    System.out.println("StringIndexOutOfBounds Exception handled");
}
    System.out.println("Hi");
    System.out.println("Hello");
}
}
