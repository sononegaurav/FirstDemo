class Factorial
{
  public static void main(String x[])
{
   int no=Integer.parseInt(x[0]);
   float factorial=1;
   for(int  i=1;i<=no;i++)
{
   factorial=factorial * i;

}
  System.out.println(factorial);
}
}