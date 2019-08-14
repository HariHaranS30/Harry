import java.util.*;
import java.lang.*;
public class sum
{
 public static void main(String args[])
 {
  int n,k,sum=0;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  k = in.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++)
  { 
   arr[i]=in.nextInt();
  }
  for(int j=0;j<k;j++)
  {
   sum+=arr[j];
  }
  System.out.println(sum);
 }
}
