import java.util.*;
import java.lang.*;
public class armstrong
{
  public static void main(String args[])
  {
   int n,rem,sum=0,temp;
   Scanner in = new Scanner(System.in);
   n = in.nextInt();
    temp = n;
   while(temp!=0)
   {
     rem=no%10;
     sum+=(rem*rem*rem);
     temp/=10;
    }
    if(sum==n)
    System.out.println("yes");
    else
    System.out.println("no");
   }
  }
