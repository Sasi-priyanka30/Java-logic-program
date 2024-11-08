import java.util.Scanner;
class Big
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter Value of a:");
a=sc.nextInt();
System.out.println("Enter Value of b:");
b=sc.nextInt();
System.out.println("Enter Value of c:");
c=sc.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("A is big:"+a);
}
else
{
System.out.println("C is big:"+c);
}
}
else
{
if(b>c)
{
System.out.println("B is big:"+b);
}
else
{
System.out.println("c is big:"+c);
}
}
}
}


