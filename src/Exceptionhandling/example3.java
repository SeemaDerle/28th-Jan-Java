package Exceptionhandling;
public class example3
{
    public static void main(String[] args)
{
    int num1=10;
    int num2=0;
    int div = 0;
   try
{
    div=num1/num2; // 10/0 = 5
}
  catch(ArithmeticException s2)
{
      //div=num1/1; //10/1 = 10
     System.out.println("Arithmetic Exception handled");
}
     System.out.println(div);
     System.out.println("hi");
}
}
