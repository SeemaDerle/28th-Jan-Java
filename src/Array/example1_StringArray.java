package Array;
public class example1_StringArray
{
public static void main(String[] args)
{
//step1: array declaration
String ar []=new String[5]; 
//step2: array initialization
ar[0]="rahul";
ar[1]="ganesh";
ar[2]="mahesh";
ar[3]="suresh";
ar[4]="ramesh";
//ar[7]="abcd";
System.out.println(ar.length); //5
//Step3: array usage
System.out.println(ar[3]); //suresh
System.out.println(ar[4]); //ramesh
System.out.println("---print all info from String array-----");
// 5<=4 5
// for(int i=0; i<=4; i++) //0 to 4
// { // 4 
// System.out.println(ar[i]);
// }
for(int i=0; i<=ar.length-1; i++)
{
System.out.println(ar[i]);
}
}
}