package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class example1_ArrayList
{
    public static void main(String[] args) 
{
    //ArrayList al=new ArrayList(); //initial/by default capacity=10
     ArrayList al=new ArrayList(8); //initial  capacity=8
     al.add("rahul");
     al.add(101);
     al.add(65.5f); //2
     al.add('A');
     al.add(101); //500 
     al.add(null); //101
     al.add(null); //null
                  //null
     System.out.println(al);
     System.out.println(al.size()); //4
     System.out.println(al.isEmpty()); //false
     System.out.println(al.get(0)); //rahul

     //add info in between arraylist --> right shift operation 
     al.add(4, 500); 
     System.out.println(al);
   
     //remove info in between arraylist --> left shift operation
     al.remove(4);
    System.out.println(al);
    System.out.println("----print data using Iterator cursor----");
    Iterator itr = al.iterator();
     while(itr.hasNext()) //TRUE
   {
      System.out.println(itr.next());
   }
      System.out.println("----print data using ListIterator cursor----");
    ListIterator litr = al.listIterator();
    while(litr.hasNext())
   {
     System.out.println(litr.next());
   }
    System.out.println("----print data using for loop----");
    for(int i=0; i<=al.size()-1; i++) 
   {
    System.out.println(al.get(i));
   }
    System.out.println("----print data using for each loop----");
   for(Object s1: al) 
   {
     System.out.println(s1);
   }
     System.out.println(al.size());
     al.clear();
     System.out.println(al.size());
}
}
