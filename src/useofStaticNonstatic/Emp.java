package useofStaticNonstatic;

public class Emp
{
    String empName;
    int empID;
    //string empCEOName;
    static String empCEOName;
    
    public void empInfo()
    {
    	System.out.println(empName+" : "+empID+" : "+empCEOName);
    }
}
