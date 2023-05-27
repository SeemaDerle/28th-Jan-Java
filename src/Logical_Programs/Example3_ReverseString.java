package Logical_Programs;

public class Example3_ReverseString
{
     public static void main(String[] args)
     {
		String org="abcd";    //0 to 3     //data
		String rev="";   //dcba
		
		  //            4-1=3       -1>=0   -1
		for(int i=org.length()-1;  i>=0;  i--)
		{                //0
			rev=rev+org.charAt(i);   //dcb + a =dcba
		}
		
		System.out.println("original string:"+ org);
		System.out.println("reverse string:"+ rev);
	}
}
