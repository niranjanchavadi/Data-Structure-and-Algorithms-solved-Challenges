import java.util.*;
class Gadad 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		String s = scan.nextLine().toLowerCase();
		char y [] = s.toCharArray();
		int size = y.length;
		Map<Character,Integer>hmap= new LinkedHashMap<>();
           int i=0;
		   while (i!=size)
		   {
			   if (hmap.containsKey(y[i])==false)
			   {
				   hmap.put(y[i],1);

			   }
			   else
				   {
				   int old = hmap.get(y[i]);
				   int newa = old + 1;
				    hmap.put(y[i],newa);
                    
     			   }

				   ++i;
		   }

		   Set<Map.Entry<Character,Integer>>map = hmap.entrySet();
		   for (Map.Entry<Character,Integer>data:map )

		   { if (data.getValue()==1)
		   {
			   System.out.println(data.getKey());
			   System.exit(0);
		   }

		   }

	}
}
