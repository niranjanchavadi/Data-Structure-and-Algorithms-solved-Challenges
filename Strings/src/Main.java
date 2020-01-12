
import java.util.*;
public class Main
{
public int sumOfDigits(String stng) 
{
  int l = stng.length();
  int sum = 0;
  for (int i = 0; i < l; i++) 
  {
    if (Character.isDigit(stng.charAt(i))) 
	{
      String tmp = stng.substring(i,i+1);
      sum += Integer.parseInt(tmp);
    }
  }
  return sum;
}


public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "ab5c2d4ef12s";
      System.out.println("The given string is: "+str1);
      System.out.println("The sum of the digits in the string is: "+m.sumOfDigits(str1));
	  }
}