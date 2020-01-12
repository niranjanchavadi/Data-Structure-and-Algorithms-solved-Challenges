class Aradhya
{
	
public static void main(String[] args) {
	
	String s = "aradhya brilliance center";
	
	String [] str = s.split(" ");
	
	for (int i = 0; i < str.length; i++) {

        char[] c = str[i].toCharArray();
        for (int j = 0; j < c.length; j++) {

            if (j == c.length / 2) {
      c[j] = Character.toUpperCase(c[c.length / 2]);
                 
                                               
            }
            
            System.out.print(c[j]); 
        }
        if (i != s.length()-1) { 
            System.out.print(",");
        }
    }
	
	
	
}



}