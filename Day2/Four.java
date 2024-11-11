import java.util.Scanner;
class Four
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a number:");
a=sc.nextInt();
if(a%5==0 && a%11==0)
{
System.out.println("Divisible by 5 & 11:"+a);
}
else
{
System.out.println("Not divisible by 5 & 11:"+a);
}
}
}