import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sno,sub1,sub2,sub3;
String sname;
System.out.println("Enter Student no:");
sno=sc.nextInt();
System.out.println("Enter Student name:");
sname=sc.next();
System.out.println("Enter Student marks in sub1:");
sub1=sc.nextInt();
System.out.println("Enter Student marks in sub2:");
sub2=sc.nextInt();
System.out.println("Enter Student marks in sub3:");
sub3=sc.nextInt();
float Total=(sub1+sub2+sub3);
float Average=(Total/3);
System.out.println("The Student Number is:"+sno);
System.out.println("The Student Name is:"+sname);
System.out.println("The Student Marks in sub1 is:"+sub1);
System.out.println("The Student Marks in sub2 is:"+sub2);
System.out.println("The Student Marks in sub3 is:"+sub3);
System.out.println("Total is:"+Total);
System.out.println("Average is:"+Average);
}
}




