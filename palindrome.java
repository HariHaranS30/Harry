import java.util.*;
import java.lang.*;
public class palindrome
{
  public static void main(String args[])
  {
    int number,rev=0,rem,temp;
    Scanner in = new Scanner(System.in);
    number = in.nextInt();
    temp = number;
    while(temp!=0)
    {
      rem = temp%10;
      rev = (rev*10)+rem;
      temp = temp/10;
     }
    if (number==rev)
     System.out.println("yes");
     else
     System.out.println("no");
   }
 }  
      
      
