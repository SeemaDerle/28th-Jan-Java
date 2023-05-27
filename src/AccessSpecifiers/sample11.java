package AccessSpecifiers;

public class sample11
{
    //example2: of default access specifier
	int b; //default --> access specifier
	
	sample11()     //default --> access specifier
	{
	b=20;
	}
	void printCubeOfNum() //default --> access specifier
	{
	System.out.println(b*b*b);
	}
	public static void main(String[] args) 
	{
	sample11 s11=new sample11();
	s11.printCubeOfNum();
	System.out.println(s11.b);
	}
}

