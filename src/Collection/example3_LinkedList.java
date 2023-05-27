package Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class example3_LinkedList
{
   public static void main(String[] args)
{
    LinkedList ll=new LinkedList(); //No Default capacity
    ll.add("mahesh");
    ll.add(105);
    ll.add(75.5f);
    ll.add('B');
    ll.add("mahesh");
    ll.add(null);
    ll.add(null);
    System.out.println(ll);
    System.out.println(ll.size());
    System.out.println(ll.isEmpty());
    System.out.println(ll.get(1));
    
    //update or modify
    ll.set(5, "kalpesh");
    System.out.println(ll);
    
   //add info in between LinkedList
    ll.add(4, "Abc");
    System.out.println(ll);
    
    //remove info in between LinkedList
    ll.remove(4);
    System.out.println(ll);
    System.out.println("--print data using iterator cursor--");
    Iterator itr = ll.iterator();
    while(itr.hasNext())
  {
    System.out.println(itr.next());
  }
   System.out.println("----print data using ListIterator cursor----");
   ListIterator litr = ll.listIterator();
   while(litr.hasNext())
  {
   System.out.println(litr.next());
  }
   System.out.println("----print data using for loop----");
   for(int i=0; i<=ll.size()-1; i++)
  {
    System.out.println(ll.get(i));
  }
   System.out.println("----print data using forEach loop----");
   for(Object s1: ll)
  {
   System.out.println(s1);
  }
   ll.clear();
   System.out.println(ll.size());
  }
}
