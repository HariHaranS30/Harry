import java.util.*;
import java.lang.*;
public class primeinterva
{
 public static void main(String args[])
 {
   int no1,no2,temp=-0;
   Scanner in = new Scanner(System.in);
   no1 = in.nextInt();
   no2 = in.nextInt();
   for(int i=no1+1;i<no2;i++)
   {
    for(int j=2;j<i-1;j++)
    {
      if(i%j==0)
       temp = temp+1;
    }
    if(temp==0)
     System.out.print(i+" ");
    else 
     temp=0;
   }
   }
   }
