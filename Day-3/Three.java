import java.util.Scanner;
class Three
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c='a',c1;
System.out.print("Enter a Character:");
c1=sc.next().charAt(0);
while(c<=c1)
{
System.out.print(" "+c);
c++;
}
}
}