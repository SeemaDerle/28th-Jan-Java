package polymorphism_runtime;
//child/sub class
public class Son extends father
{
  //example of method override
	public void bike()
	{
		System.out.println("bike:FZ V3");
	}
	public void car()   //override
	{
		System.out.println("car:kia");
	}
	public void money()   //override
	{
		System.out.println("money:2L");
	}
	
	//public void home()
	//{
	//system.out.println("home:2BHK");
	//} 
}
