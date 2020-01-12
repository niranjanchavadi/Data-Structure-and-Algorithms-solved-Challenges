import java.util.Scanner;

public class Alphabet
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
Scanner scan = new Scanner (System.in);
System.out.println("enter the num");
int n =scan.nextInt();
        

        for (int i = 0; i <= n; i++)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= n- i; k++)
            {
                System.out.print((char) (alphabet + k) );
            }
            System.out.println();
        }
    }
}