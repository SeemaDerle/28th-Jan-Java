package Exceptionhandling;
public class example7
{
public static void main(String[] args)
{
String s1="abcd";
int [] ar= {40,20,10,30};
try
{
System.out.println(s1.charAt(5)); //riskycode1
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("StringIndexOutOfBounds Exception handled");
}
try
{
System.out.println(ar[9]); //riskycode//risky code 2
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("ArrayIndexOutOfBounds Exception handled");
}
}
}

