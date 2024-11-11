import java.util.*;
class Twelve
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter a value:");
c=sc.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
System.out.println("Alphabet");
}
else if(c>=1||c<=9)
{
System.out.println("Number");
}
else
{
System.out.println("Special character");
}
}
}