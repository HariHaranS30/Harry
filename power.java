import java.util.*;
import java.lang.*;
public class power
{
 public static void main(String args[])
 {
  long n,k,result=1;
  Scanner in = new Scanner(System.in);
  n = in.nextLong();
  k = in.nextLong();
  if(n>0 && k==0)
   System.out.println(0);
  else if(n==0)
  System.outprintln(0);
  else
  {
    for(int i=1;i<=k;i++)
    {
     result = result * n;
     }
     System.out.println(result);
     }
  }
}
     
