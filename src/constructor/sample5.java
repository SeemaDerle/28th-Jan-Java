package constructor;

public class sample5
{
  //Example3:user defined constructor with parameter
	//declaration
	int num1;     //5
	int num2;   //6
	//step2:initialization
	//user defined constructor with 2 int (int,int) parameter
	//use1:to initialize global variable
	//use2:copy all the members of class into object
	sample5(int a,int b)     //10,20  //declaration
	{
		num1=a;   //5  //assign local variable info into global variable
		num2=b;   //6
	}
	//step3:usage
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args)
	{
		sample5 s5 =new sample5(10,20);   //initialization of local variable
		s5.add();  //30
		s5.mul();   //200
		
		System.out.println("------");
		
		sample5 s6=new sample5(5,6);
		s6.add();   //11
		s6.mul();   //30
		
		System.out.println("--------");
		sample6 s7=new sample6(8,6);
		s7.sub();  //2
		
		System.out.println("-------");
		
		sample6 s8=new sample6(80,60);
		s8.sub();    //20
	}
		
	}
	
	
	
	
	
	
	
	

