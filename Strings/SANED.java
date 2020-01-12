
public class SANED {
	
	public static void main(String[] args) {
        String s = "ABBAS";
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        int middleChar = -1;
        StringBuilder sb = new StringBuilder(s.length());
        int i = 0;
        for (i = 0; i < count.length; i++) {
            if (count[i] % 2 == 1) {
                if (count[i] == 1 && middleChar == -1) {
                    middleChar = i;
                    count[i]--;
                } else {
                    break;
                }
            } else if (count[i] != 0) {
                for (int j = 0; j < count[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                    count[i]--;
                }
            }
        }
        if (i != count.length) {
            System.out.println("Could not create the palindrome.");
            return;
        }
        if (middleChar != -1) {
            sb.append((char) (middleChar + 'A'));
        }
        i = count.length - 1;
        while (i >= 0) {
            if (count[i] == 0) {
                i--;
                continue;
            }
            sb.append((char) (i + 'A'));
            count[i]--;
            if (count[i] == 0) {
                i--;
            }
        }
        System.out.println(sb);
    }

}
