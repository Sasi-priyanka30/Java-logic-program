import java.util.Scanner;
class Nine
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter a alphabet:");
c=sc.next().charAt(0);
if(c>='a'&& c<='z')
{
System.out.println("Lowercase:"+c);
}
else if(c>='A'&&c<='Z')
{
System.out.println("Uppercase:"+c);
}
else
{
System.out.println("Invalid");
}
}
}