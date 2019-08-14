import java.util.*;
import java.lang.*;
public class count
{
 public static void main(String args[])
 {
  int no,count=0;
  Scanner in = new Scanner(System.in);
  no = in.nextInt();
  while(no!=0)
  {
   no/=10;
   ++count;
  }
  System.out.println(count);
 }
 }
