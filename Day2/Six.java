import java.util.Scanner;
class Six
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int y;
System.out.println("Enter a year:");
y=sc.nextInt();
if(y%4==0)
{
System.out.println("Leap Year:"+y);
}
else
{
System.out.println("Not a leap year:"+y);
}
}
}