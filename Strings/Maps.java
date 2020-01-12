import java.util.*;
class Maps 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine().toLowerCase();
		char y[] = s.toCharArray();
		int n = y.length;
		Map<Character,Integer>map =new LinkedHashMap<>();
        int i =0;
		while (i!=n)
		{
			if (map.containsKey(y[i])==false)
			{
               map.put(y[i],1);
			}
			else
				{int oldval = map.get(y[i]);
			      int newvalue = oldval+1;
				  map.put(y[i],newvalue);

			     }
				 ++i;

		}



		Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		for (Map.Entry<Character,Integer>data:hmap )
		{
			if (data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
 	}
}
