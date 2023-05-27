package assignmentno_1_nested_if;

public class example_nested_if 
{
   public static void main(String[] args)
   {
	 int sa=750;
    if(sa>=500)
   {
	   System.out.println("NO Delivery Charges");
   
	  
    if (sa>=10000)
	   {
		   System.out.println("Additional 10% Discount");
	   }
	   else
	   {
		   System.out.println("No Discount");
	   }
   }
    else
   {
	   System.out.println("Additional 50Rs you have to pay");
		   
	    }
	
   }
}
	
	
	

