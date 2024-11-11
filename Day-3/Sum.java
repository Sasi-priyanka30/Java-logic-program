import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,fd,ld,sum=0;
System.out.println("Enter a two digit number");
n=sc.nextInt();
ld=n%10;
while(n>=10)
{
n=n/10;
}
fd=n;
System.out.println("first digit=" + fd);
System.out.println("last digit=" + ld);
sum=fd+ld;
System.out.println("Sum of first and last digit=" + sum);
}
}
