import java.util.*;
import java.lang.*;
public class armstrong
{
  public static void main(String args[])
  {
   int n,rem,sum=0;
   Scanner in = new Scanner(System.in);
   n = in.nextInt();
   while(n!=0)
   {
     rem%=10;
     sum+=(rem*rem*rem);
     n/=10;
    }
    if(sum==n)
    System.out.prinln("yes");
    else
    System.out.prinln("no");
   }
  }
