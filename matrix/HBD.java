import java.util.Scanner;

class HBD { 
 static Scanner scan = new Scanner(System.in);
	static int n = scan .nextInt();
	//static int n =5;
	static void printSpiral(int n) 
    { 
		 for (int i = n-1; i >= 0; i--) { 
            for (int j = n-1; j >=0; j--) { 
                  
                int x; 
 x = Math.min(Math.min(i, j),  
                    Math.min(n - 1 - i, n - 1 - j)); 
   if (i <= j) 
                    System.out.print((n - 2 * x) * (n - 2 * x) -  
                                     (i - x) - (j - x) + "\t"); 
         else
                    System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + 
                                     (i - x) + (j - x) + "\t"); 
            } 
            System.out.println(); 
        } 
    } 
    static void printSpiral2(int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {  
                int x; 
                x = Math.min(Math.min(i, j),  
                    Math.min(n - 1 - i, n - 1 - j)); 
                if (i <= j) 
                    System.out.print((n - 2 * x) * (n - 2 * x) -  
                                     (i - x) - (j - x) + "\t"); 
                else
                    System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + 
                                     (i - x) + (j - x) + "\t"); 
            } 
            System.out.println(); 
        } 
    } 
   
    public static void main(String args[]) 
    {  
        
  if(n%2==0)
  {
        printSpiral2(n); 
    } 
  else {
	     printSpiral(n);
       }
  }
} 