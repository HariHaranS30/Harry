import java.lang.*;
import java.util.*;
public class arraysort
{
 public static void main(String args[])
 {
  int n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int a[] = new int[n];
  for(int i=0;i<n;i++)
  {
   a[i]=in.nextInt();
   }
   Arrays.sort(a);
   for(int i=0;i<n;i++)
   {
    System.out.println(a[i]);
    }
   }
}
