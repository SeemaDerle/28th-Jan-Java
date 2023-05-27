package AccessSpecifiers;

public class sample1
{
  //example1:of private access specifier
	private int a;
	private sample1()
	{
		a=10;
	}
	private void printsquareofnumber()
	{
		System.out.println(a*a);
	}
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		System.out.println(s1.a);
		s1.printsquareofnumber();
	}
}
