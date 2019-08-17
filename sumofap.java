import java.lang.*;
import java.util.*;
public class sumofap
{
 public static void main(String args[])
 {
  double n,a,d,sum;
  Scanner in = new Scanner(System.in);
  n = in.nextDouble();
  a = in.nextDouble();
  d = in.nextDouble();
  sum = (n/2)*(2*a+(n-1)*d);
  System.out.println(sum);
  }
  }
