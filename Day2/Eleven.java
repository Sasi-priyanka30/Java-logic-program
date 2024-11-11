import java.util.Scanner;
class Eleven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter i value:");
i=sc.nextInt();
switch(i)
{
case 1:
    System.out.println("sunday");
    break;
case 2:
    System.out.println("monday");
    break;
case 3:
    System.out.println("wednesday");
    break;
case 4:
    System.out.println("thrusday");
    break;
case 5:
    System.out.println("friday");
    break;
case 6:
    System.out.println("saturday");
    break;
default:
    System.out.println("Invalid");
}
}
}






