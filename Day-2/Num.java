import java.util.Scanner;
class Num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter value of a:");
a=sc.nextInt();
if(a>0)
{
System.out.println("The given number is Positive:"+a);
}
else
{
System.out.println("The given number is Negative:"+a);
}
}
}