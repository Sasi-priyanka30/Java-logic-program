import java.util.Scanner;
class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,count=0;
System.out.println("Enter n value:");
n=sc.nextInt();
while(n!=0)
{
n=n/10;
++count;
}
System.out.println("No.of digits:"+count);
}
}