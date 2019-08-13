import java util.*;
class main
{
 public static void main(String args[])
 {
  int no;
  Scanner in = new Scanner(System.in);
  no = nextInt();
  if(no>0)
   System.out.println("POSITIVE");
  else if(no<0)
   System.out.println("NEGATIVE");
  else if(no==0)
   System.out.println("ZERO");
 }
 }
