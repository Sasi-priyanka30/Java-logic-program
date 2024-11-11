import java.util.*;
class Fl
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,fd=0,ld=0;
System.out.println("Enter n value:");
n=sc.nextInt();
ld=n%10;
while(n!=0)
{
fd=n%10;
n=n/10;
}
System.out.println("The first digit is:"+fd);
System.out.println("The Last digit is:"+ld);
}
}