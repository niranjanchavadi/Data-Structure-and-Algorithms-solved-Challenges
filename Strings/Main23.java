
import java.util.*;
public class Main23 {
 
  public static void main(String[] args) {
  String str = "always";
  Character ch = findWithLinkedHashMap(str);
  if(ch != null){
   System.out.println("Character is "  + ch);
  }else{
   System.out.println("No non-repeating character found");
  }
 }

 /**
  * Method to find non-repeated character using LinkedHashMap
  * @param str
  * @return
  */
 private static Character findWithLinkedHashMap(String str){
  Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
  for(int i = 0; i < str.length(); i++){
   Character c = str.charAt(i);
   // If found in map increment the count
   if(charMap.containsKey(c)){
    charMap.put(c, charMap.get(c) + 1);
   }else{
    charMap.put(c, 1); // First time insertion
   }
  }
  // Find the first character with count 1
  for(Entry<Character, Integer> entry : charMap.entrySet()){
   if(entry.getValue() == 1){
    return entry.getKey();
   }
  }
  return null;
 }
}