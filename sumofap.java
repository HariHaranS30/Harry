import java.lang.*;
import java.util.*;
public class sumofap
{
 public static void main(String args[])
 {
  int n,a,d,sum;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  a = in.nextInt();
  d = in.nextInt();
  sum = (n/2)*(2*a+(n-1)*d);
  System.out.println(sum);
  }
  }
