//import java.util.Scanner;
public class Das {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int n = 0;
       // Character c;
        System.out.println("Enter height of the triangle : ");
       //n = sc.nextInt();
        n = 3;
       // System.out.println("Which character you want to use : ");
       // c = sc.next().charAt(0);
  
        int i, j, k , m=0;
        for (i = n; i > 0; i--) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
            	int alphabet=65;
            	if(m<=n-1)
            	{ 
				System.out.print((char) (alphabet + m++) );}
            	
            	if(m>=n) 
            	{
            		System.out.print((char) (alphabet + m-2) );
            	}
           
            }
            System.out.println();
        }
    }
}
