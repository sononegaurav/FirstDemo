//Q27. Write a java program to Check If a Number Is a Happy Number or Not.
import java.util.*;
public class HappyNumber
{
  public static void main(String x[])
{
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
    int n=sc.nextInt();
  int temp=n;
  while(temp!=1 && temp!=4)
{
   int sum=0;
   while(temp>0)
{
   int rem=temp%10;
    sum=sum+rem*rem;
     temp/=10;
}
   temp=sum;
 }
  if(temp==1)
{
   System.out.println("Happy number");
 }
  else
{
 System.out.println("UNHAPPU");
}
}
}