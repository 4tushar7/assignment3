import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.print("Enter the integer = ");
int n=S.nextInt();
int revint=0;
int remainder;
int orig;
orig=n;
while(n!=0)
{
remainder = n%10;
revint = revint*10 + remainder;
n=n/10;
}
if(orig == revint)
   System.out.println(orig+" is a palindrome no.");
else
   System.out.println(orig+" is not a palindrome no.");
}
}