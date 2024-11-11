import java.util.Scanner;
class Ten
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1,sum=1,n;
System.out.println("Enter n value:");
n=sc.nextInt();
while(i<=n)
{
sum=sum*i;
i++;
}
System.out.println("Factorial of a number is:");
System.out.println(sum);
}
}