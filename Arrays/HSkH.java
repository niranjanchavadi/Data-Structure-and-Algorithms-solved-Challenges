class HSkH

{

static int minimumSets(String s, int y) 
{
		int cnt =0;
		int num =0;
		int l = s.length();
		
		boolean f = false;
		for (int i=0;i<l ;i++ )
		{
			num = num*10+(s.charAt(i)-'0');



			               if (num<=y)
			               {f=true;
			                }
			            else
			        {
				           if (f)
				           {
					        cnt+=1;
			                }

					        num = s.charAt(i)-'0';
			                 f = false;
					         if (num<=y)
					         {
						      f= true;
					         }
					        else
						    {
						      num=0;
					         }
			

			          }
		    }


				if(f==true)
			  cnt+=1;
			  return cnt;
}


	public static void main(String[] args) 
	{
		String s = "1234";
		int y = 30;

 System.out.println(minimumSets(s, y)); 









	}
}
