import java.util.Scanner;
class Num1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter a Character:");
ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("The given character is Oval:"+ch);
}
else
{
System.out.println("The given character is Consonent:"+ch);
}
}
} 


