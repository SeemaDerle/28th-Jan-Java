package Collection;

import java.util.TreeSet;

public class example7_Generic1 
{
   public static void main(String[] args) 
	{
    TreeSet <Integer>tr=new TreeSet <Integer>();
    tr.add(101);
	tr.add(105);
	tr.add(104);
	tr.add(103);
	tr.add(102);
	tr.add(101);
	tr.add(107);
	tr.add(106);
	for (Integer S1:tr)
	{
		System.out.println(S1);
	}
}
}