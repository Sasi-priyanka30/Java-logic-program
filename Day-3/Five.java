import java.util.Scanner;
class Five
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1,n;
System.out.println("Enter n value:");
n=sc.nextInt();
while(i<=n)
{
System.out.print(i+" ");
i=i+2;
}
}
}