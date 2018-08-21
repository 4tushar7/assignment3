import java.util.Scanner;
class pattern
{
public static void main(String[] args)
{
Scanner S=new Scanner(System.in);
System.out.print(" Enter the value of n = ");
int n=S.nextInt();
int i;
int j;
for(i=1;i<=n;i++)
{
  for(j=1;j<=i;j++)
    {
    System.out.print("*"); 
    }
System.out.println();
}
}
}