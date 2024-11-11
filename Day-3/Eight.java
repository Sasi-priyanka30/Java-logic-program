import java.util.Scanner;
class Eight
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1,sum=0,n;
System.out.println("Enter n value:");
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i=i+2;
}
System.out.println("The Sum is:");
System.out.println(sum);
}
}