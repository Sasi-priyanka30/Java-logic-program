import java.util.Scanner;  
class Product   
{  
public static void main(String args[])  
{  
int n,digit,pro=1;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number: ");  
n=sc.nextInt();  
while(n>0)  
{      
digit=n%10;    
pro=pro*digit;    
n=n/10;  
}    
System.out.println("Sum of Digits: "+pro);  
}  
}  