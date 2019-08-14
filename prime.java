import java.util.*;
import java.lang.*;
public class prime 
{
 public static void main(String args[])
 {
  int n,temp=0;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  for(int i=2;i<=n-1;i++)
  {
   if(n%i==0)
   {
    temp=temp=1;
    }
   }
   if(temp>0)
    System.out.println("no");
   else
    System.out.println("yes");
  }
  }
  
