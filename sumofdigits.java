import java.util.*;
class sumdigits
{
public static void main(String args[])
{
int n,d,sum=0;
System.out.println("enter the number: ");
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(n>0)
{
d=n%10;
sum=sum+d;
n=n/10;
}
System.out.println("sum of digits: "+sum);
}
}
