import java.util.Scanner;
class Switch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int day;
System.out.println("Enter the value of Day:");
day=sc.nextInt();
switch(day)
{
case 1:
     System.out.println("The day is Sunday");
     break;
case 2:
     System.out.println("The day is Monday");
     break;
case 3:
     System.out.println("The day is Tuesday");
     break;
case 4:
     System.out.println("The day is Wednesday");
     break;
case 5:
     System.out.println("The day is Thrusday");
     break;
case 6:
     System.out.println("The day is Friday");
     break;
case 7:
     System.out.println("The day is Saturday");
     break;
default:
     System.out.println("Invalid");
}
}
}
