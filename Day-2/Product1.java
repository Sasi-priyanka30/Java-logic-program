import java.util.Scanner;
class Product1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost;
float pqty;
System.out.println("Enter Product no:");
pno=sc.nextInt();
System.out.println("Enter Product name:");
pname=sc.next();
System.out.println("Enter Product cost:");
pcost=sc.nextFloat();
System.out.println("Enter Product Quantity:");
pqty=sc.nextFloat();
float Bill=(pcost*pqty);
System.out.println("The product Number is:"+pno);
System.out.println("The product Name is:"+pname);
System.out.println("The product Cost is:"+pcost);
System.out.println("The product Quantity is:"+pqty);
System.out.println("The product Bill is:"+Bill);
}
}




