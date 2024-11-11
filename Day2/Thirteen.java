import java.util.Scanner;
class Thirteen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float sub1,sub2,sub3,sub4,sub5;
System.out.println("enter sub1 marks:");
sub1=sc.nextFloat();
System.out.println("enter sub2 marks:");
sub2=sc.nextFloat();
System.out.println("enter sub3 marks:");
sub3=sc.nextFloat();
System.out.println("enter sub4 marks:");
sub4=sc.nextFloat();
System.out.println("enter sub5 marks:");
sub5=sc.nextFloat();
float Total=(sub1+sub2+sub3+sub4+sub5);
System.out.println("Total is:"+Total);
float percentage=((Total/500)*100);
System.out.println("percentage is:"+percentage);
if(percentage>=90)
{
System.out.println("Grade A");
}
else if(percentage>=80)
{
System.out.println("Grade B");
}
else if(percentage>=70)
{
System.out.println("Grade C");
}
else if(percentage>=60)
{
System.out.println("Grade D");
}
else if(percentage>=40)
{
System.out.println("Grade E");
}
else if(percentage<40)
{
System.out.println("Grade F");
}
else
{
System.out.println("Invalid");
}
}
}


































