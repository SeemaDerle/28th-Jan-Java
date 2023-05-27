package StringClass;
public class Sample7
{
public static void main(String[] args)
{
String s1="velocity";
String s2="";
String s3="abcd";
String s4="ABCD";
String s5="my name is abc";
String s6="abcabcab"; // 0 to 7
System.out.println(s5.replace("abc", "rahul")); // my name is xyz
System.out.println(s5);
System.out.println(s3.concat(s4)); // abcdABCD
System.out.println(s3+s4); //abcdABCD
System.out.println("---------");
System.out.println(s1.substring(1, 5)); //eloc
System.out.println(s1.substring(4)); //city
System.out.println(s5.endsWith("abc")); //true
System.out.println(s5.startsWith("my")); //true
System.out.println("-----------------");
System.out.println(s6.lastIndexOf('a')); //6
System.out.println(s6.indexOf('a')); //0
System.out.println(s1.charAt(4)); //c
System.out.println("----------------");
// s1=s1.toUpperCase(); //VELOCITY
// System.out.println(s1);
System.out.println(s1.toUpperCase()); //VELOCITY
// s4=s4.toLowerCase();
// System.out.println(s4);
System.out.println(s4.toLowerCase()); //abcd
System.out.println("----------");
System.out.println(s3.equals(s4)); //false
System.out.println(s3.equalsIgnoreCase(s4)); 
//true
System.out.println(s5.contains("is"));
System.out.println(s1.length()); //8
System.out.println(s1.isEmpty()); //false
System.out.println(s2.isEmpty());
}
}
