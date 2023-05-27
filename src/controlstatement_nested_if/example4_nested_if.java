package controlstatement_nested_if;

public class example4_nested_if
{
public static void main(String[] args)
{
	int PEM=100;
	int MEM=0;
	
	//100>=300
	if(PEM>300)    //Outer if
	{
		System.out.println("eligible for mains exam");
	
		
	
	 
	// 700>=800
	if(MEM>=800)   // Nested or inner if
	{
		System.out.println("got selected");
	}
	else
	{
		System.out.println("not eligible for mains exam:PEM<800");
	}
	}
	else
	{
		System.out.println("not eligible for mains :PEM<300");
	}
	
	
}
}

