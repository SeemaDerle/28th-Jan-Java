package constructor;

public class sample6
{
    int num3;  //8
    int num4;  //6
    
    //user defined with 2 int parameter constructor
    //use1:initialize global variable
    //use2:copy all the members of class into object
    
    sample6 (int c,int d)   //8 6
    {
    	num3=c;   //8
    	num4=d;  //6
    }
    public void sub()
    {
    	System.out.println(num3-num4);
    }
}
