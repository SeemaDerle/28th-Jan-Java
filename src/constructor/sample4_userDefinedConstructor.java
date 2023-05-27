package constructor;

public class sample4_userDefinedConstructor
{
    //step1:declaration
	int num3;    //50
	int num4;  //30
	//step2:initialization
	//use1:initialize global variable
	//use2:copy all the member of class into object
	sample4_userDefinedConstructor()
	{
		num3=50;
		num4=30;
	}
	//step3:usage
	public void sub()
	{
		System.out.println(num3-num4);
	}
}
