import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,temp,r,sum=0;
System.out.print("Enter n value:");
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;    
sum=(sum*10)+r;    
n=n/10;    
}    
if(temp==sum)    
   System.out.println("palindrome number ");    
else    
   System.out.println("Not palindrome");    
} 
} 