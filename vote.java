import java.util.*;
class vote
{
public static void main(String args[])
{
int x;
System.out.println("Enter the age:");
Scanner S=new Scanner(System.in);
x=S.nextInt();
if(x>=18)
{
System.out.println("Eligible");
}
else
{
System.out.println(" eligible to vote after "+(18-x)+" years");
}
}
}
