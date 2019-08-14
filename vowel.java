import java.util.*;
import java.lang.*;
public class vowel
{
 public static void main(String args[])
 { char c;
   Scanner in =  new Scanner(System.in);
   c = in.nextChar();
   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    System.out.println("Vowel");
   else if(c>'a' && c<'z')
    System.out.println("Consonant");
   else 
    System.out.println("Invalid");
  }
  }
