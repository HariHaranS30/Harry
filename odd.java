import java.util.*;
import java.lang.*;
public class odd
{
 public static void main(String args[])
 {
   int no1,no2;
   Scanner in = new Scanner(System.in);
   no1 = in.nextInt();
   no2 = in.nextInt();
   for(int i=no1+1;i<no2;i++)
   {
    if(i%2!=0)
     System.out.print(i);
   }
  }
  }
