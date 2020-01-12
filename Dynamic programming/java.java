
public class java {

	

	public static void main(String[] args) {

		int n = 11;
		int p =0;
		int decimal=0;
		int count= 0; 
		while (n!=0)
		{
	 decimal+=((n%10)*Math.pow(2,p));
		n=n/10;
		count++;
		p++;
		if (count==2&&p==2) {
		System.out.println(decimal);
		count =0;
		decimal=0;
		p=0;
		}	
		}

	}

}
