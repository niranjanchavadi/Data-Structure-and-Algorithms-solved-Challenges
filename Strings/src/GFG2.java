public class PalindromeIsPossible {
        //count the chars in the input string
            //if not more than one character has odd count then palindrome is possible
            public static boolean isPalindromPossible(String input)
            {
                int[] charCount = new int[128];
                for(int i = 0 ; i < input.length() ; i++)
                {
                    charCount[(int)input.charAt(i)]++;
                }
                int oddCount = 0 ;
                for(int i  = 0 ; i < 128 ; i++)
                {
                    if(charCount[i] % 2!=0)
                    {
                        oddCount++;
                    }
                }

                if(oddCount != 0 && oddCount != 1)
                {
                    return false;
                }
                return true;
            }

            public static void main(String[] args) {
                String input = "xyy";
                System.out.println(isPalindromPossible(input));
                System.out.println((input));
                
            }
    }
