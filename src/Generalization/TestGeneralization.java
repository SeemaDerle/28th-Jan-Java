package Generalization;
public class TestGeneralization
{
public static void main(String[] args) 
{
System.out.println("Features of Jio SimCard");
Jio j=new Jio();
j.featureA();
j.sms();
j.ac();
j.data();
System.out.println("Features of VI SimCard");
VI v=new VI();
v.featureB();
v.sms();
v.ac();
v.data();
System.out.println("Features of Airtel SimCard");
Airtel a=new Airtel();
a.featureC();
a.sms();
a.ac();
a.data();
}
}
