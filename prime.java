import java.util.*;
class prime
{
public static void main(String args[])
{
int i;
for(i=100;i<=900;i++)
{
if(i%i==0 && i%2!=0 && i%3 !=0 && i%5!=0)
{
System.out.print(i+"\n");
}
}
}
}
