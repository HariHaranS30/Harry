import java.lang.*;
import java.util.*;
public class arraymax
{
 public static void main(String args[])
 {
  int n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++)
  {
   arr[i]=in.nextInt();
  }
  int max=arr[0];
  for(int j=0;j<n;j++)
  { 
   if(arr[j]>max)
   max = arr[j];
  }
   System.out.println(max);
 }
}
