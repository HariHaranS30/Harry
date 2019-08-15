import java.util.*;
import java.lang.*;
public class armstrongs
{
 public static void main(String args[])
 {
  int n1,n2,rem,sum=0;
  Scanner in = new Scanner(System.in);
  n1 = in.nextInt();
  n2 = in.nextInt();
  for(int i=n1+1;i<n2;i++)
  {
   while(i!=0)
   {
    rem = i%10;
    sum+=(i*i*i);
    i/=10;
   }
   if(sum==i)
   System.out.print(i+" ");
  }
  }
  }
