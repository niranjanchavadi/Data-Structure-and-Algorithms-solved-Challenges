public class FHSF
{
	public static void main(String[] args) 
	{
	String as = "Shrishail Channa";
	StringBuilder sb = new StringBuilder();	
	String [] s= as.split(" "); 
	for (String j:s)
	{
		sb.append(j.replace(j.charAt(0),j.charAt(2))).append(" ");
	}
	   System.out.println(sb.toString());
	}
}
	
