import java.util.Scanner;

public class A {
	
	
	public static void main(String[] args) {
		
//		Scanner sc  = new Scanner(System.in);
		String s = "Strigfdmsg  ahgxdjagh";
		String as []=s.split(" ");
		String ac = as.toString();
		String bc = new String();
		for (int i=0; i<ac.length();i++)
			
		{ 
			 bc.concat(ac.replace(ac.charAt(0),ac.charAt(1))).concat(" ");
			
		}
		
		
		System.out.println(bc);
		
		
	}

}
