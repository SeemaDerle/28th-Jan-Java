package constructor;

public class sample3_userDefinedConstructor 
{
  //example2:User defined constructor
	//step1:declaration of variable
	int num1;   //10
	int num2;  //20
	
	//step2: variable initialization
	//user defined constructor-->provided by user
	//use1:initialize global variable
	//use2:copy/load all the member of class into object
	sample3_userDefinedConstructor()
	{
		num1=10;
		num2=20;
	}
	//step3:usage
	public void addition()
	{
		System.out.println(num1+num2);
	}
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		sample3_userDefinedConstructor s3=new sample3_userDefinedConstructor();   //user defined constructor call from same class
		s3.addition();   //30
		s3.multiplication();   //200
		
		System.out.println("------");
		
		sample4_userDefinedConstructor s4=new sample4_userDefinedConstructor();   //user defined constructor call from diff class
		s4.sub();   //20
	}
}
