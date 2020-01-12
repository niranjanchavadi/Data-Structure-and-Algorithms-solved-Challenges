import java.util.*;
class Java1
{
 public static void main(String args[])
 {
 int i,vowels=0,consonants=0,digits=0,spaces=0,specialCharacters=0;
     String s;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter sentence");
 s=sc.nextLine();
 char str[] = s.toCharArray();
 int n= str.length;
     for(i=0;i<n;i++)
     {
       if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||str[i]=='o' || str[i]=='u' || str[i]=='A' ||str[i]=='E' || str[i]=='I' || str[i]=='O' ||str[i]=='U')
         {
           vowels++;
         }
         else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
         {
             consonants++;
         }
         else if(str[i]>='0' && str[i]<='9')
         {
             digits++;
         }
          else if (str[i]==' ')
         {
                        	spaces++;
       }
         else
         { 
                 	specialCharacters++;
         }
     }
     System.out.println("Vowels = "+vowels);
     System.out.println("Consonants = "+consonants);
     System.out.println("Digits = "+digits);
     System.out.println("White spaces = "+spaces);
     System.out.println("Special characters = "+specialCharacters);
 }
}




