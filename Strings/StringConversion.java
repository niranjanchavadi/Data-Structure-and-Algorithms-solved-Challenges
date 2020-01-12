class StringConversion 
{
	public static void main(String[] args) 
	{

		    String s = "My name is Niranjan";
			StringBuilder o = new StringBuilder();
			String [] s1 = s.split(" ");
			for (String j:s1 )
			{
				o.append(j.replace(j.charAt(0),j.charAt(1))).append(" ");
			}

		System.out.println(o.toString());
	}
}
