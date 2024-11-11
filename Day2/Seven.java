import java.util.Scanner;
class Seven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter a character:");
c=sc.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
System.out.println("Alphabet:"+c);
}
else
{
System.out.println("Not a alphabet:"+c);
}
}
}