import java.lang.*;
import java.util.*;
public class arraymin
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
  int min=arr[0];
  for(int j=0;j<n;j++)
  { 
   if(arr[j]<min)
   min = arr[j];
  }
   System.out.println(min);
 }
}
