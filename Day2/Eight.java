import java.util.Scanner;
class Eight
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter a alphabet:");
c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
System.out.println("vowel:"+c);
}
else
{
System.out.println("consonant:"+c);
}
}
}