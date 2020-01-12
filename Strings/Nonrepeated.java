import java.util.*;
public class Nonrepeated {
 public static void main(String[] args) {
  String str1 = "temp".replaceAll(" ","");
  System.out.println("The given string is: " + str1);
  for (int i = 0; i < str1.length(); i++) {
   boolean unique = true;
   for (int j = 0; j < str1.length(); j++) {
    if (i != j && str1.charAt(i) == str1.charAt(j)) {
     unique = false;
    }
   }
   if (unique) {
    System.out.print(str1.charAt(i)+" ");
  
   }
  
  }
 }
}