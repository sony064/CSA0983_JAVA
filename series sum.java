import java.util.*;
class series_sum
{
public static void main(String args[])
{
int i=0,n,sum=0;
System.out.println("enter n_value: ");
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(i<n)
{
i+=1;
sum+=i;
}
System.out.println("sum of series is: "+sum);
}
}
