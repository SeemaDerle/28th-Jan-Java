package method_withoutparameter;

public class sample1 
{
public static void main(String[] args)
{
	
	m1();
	sample2.m2();
	sample1 S7=new sample1();
	S7.m3();
	sample2 S8=new sample2();
	S8.m4();
	

	
}
public static void m1() 
{
	System.out.println("running staic regular method:m1 from same class");
}
public void m3() 
{
	System.out.println("running nonstatic regular method:m3 from same class");
}

}


