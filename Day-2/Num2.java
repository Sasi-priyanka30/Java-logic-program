import java.util.Scanner;
class Num2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter value of A:");
a=sc.nextInt();
System.out.println("Enter value of B:");
b=sc.nextInt();
if(a>b)
{
System.out.println("A is big:"+a);
}
else if(b>a)
{
System.out.println("B is big:"+b);
}
else
{
System.out.println("Both are equal");
}
}
}

