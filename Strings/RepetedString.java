
public class RepetedString {

	public static void main(String[] args) {
		
		String a = "Ragava is great person walliball";
		int i=0;
		String [] str = a.split(" ");
		
		char c [] =str[i].toCharArray();
  
		for (int j=0 ;j<c.length;j++)
		{
			for (int k=j+1;k<c.length-1;k++ )
			{
				if (c[j]==c[k])
				{
					System.out.println(c[k]);
					if (c[k]!=0)
					{
						
					}
				}
			}
			
		}
		
	}

}
