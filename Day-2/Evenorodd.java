import java.util.Scanner;
class Evenorodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter value of a:");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("The given number is Even:"+a);
}
else
{
System.out.println("The given number is Odd:"+a);
}
}
}