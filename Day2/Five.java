import java.util.Scanner;
class Five
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a value:");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("Even:"+a);
}
else
{
System.out.println("Odd:"+a);
}
}
}