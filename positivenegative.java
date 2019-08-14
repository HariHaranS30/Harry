import java.util.*;
import java.lang.*;
class positivenegative
{
 public static void main(String args[])
 {
  int no;
  Scanner in = new Scanner(System.in);
  no = in.nextInt();
  if(no>0)
   System.out.println("Positive");
  else if(no<0)
   System.out.println("Negative");
  else if(no==0)
   System.out.println("Zero");
 }
 }
