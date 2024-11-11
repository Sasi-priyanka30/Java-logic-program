import java.util.Scanner;
class Nine
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.print("Enter n value:");
n=sc.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+(i*n));
}
}
}