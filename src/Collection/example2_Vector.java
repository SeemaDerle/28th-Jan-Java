package Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class example2_Vector
{
    public static void main(String[] args) 
{
     Vector V=new Vector(); //initial capacity =10 
     V.add("rahul");
     V.add(101);
     V.add(65.5f); //2
     V.add('A');
     V.add(101); //500 
     V.add(null); //101
     V.add(null); //null
                //null
     System.out.println(V);
     System.out.println(V.size()); //4
     System.out.println(V.isEmpty()); //false
     System.out.println(V.get(0)); //rahul //add info in between vector --> right shift operation 
     V.add(4, 500); 
     System.out.println(V);
     
   //remove info in between vector --> left shift operation
     V.remove(4);
     System.out.println(V);
     System.out.println("----print data using Iterator cursor----");
     Iterator itr = V.iterator();
     while(itr.hasNext()) //TRUE
  {
     System.out.println(itr.next());
  }
     System.out.println("----print data using ListIterator cursor----");
     ListIterator litr = V.listIterator();
     while(litr.hasNext())
  {
     System.out.println(litr.next());
   }
     System.out.println("----print data using for loop----");
   for(int i=0; i<=V.size()-1; i++) 
  {
     System.out.println(V.get(i));
   }
     System.out.println("----print data using for each loop----");
    for(Object s1: V) 
  {
     System.out.println(s1);
  }
    System.out.println("----print data using for Enumeration cursor----");
    Enumeration enu = V.elements();
    while(enu.hasMoreElements())
  {
     System.out.println(enu.nextElement());
   }
     System.out.println(V.size());
     V.clear();
     System.out.println(V.size());
}
}
