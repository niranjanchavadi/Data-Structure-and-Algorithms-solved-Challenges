

class Character{ 



	

		// Function to compute the ASCII value of each 
		// character one by one 
		static void ASCIISentence(String str) 
		{ 
			int l = str.length(); 
		
			
				for (int i = 0; i < l; i++) { 
					if (str.charAt(i)>=1&&str.charAt(i)<=64) {
						System.out.print(str.charAt(i));}
					
					else
					     if(str.charAt(i)>=65&&str.charAt(i)<=90)
					{
					    	 char convert = str.charAt(i); 
								System.out.print(convert-64); 
					}
				 else 
					{
					char convert = str.charAt(i); 
					System.out.print(convert-96); 
				  }
				
			}
		} 

		// Driver function 
		public static void main(String args[]) 
		{ 
			String str = "HELLO 45 "; 
			System.out.println("ASCII Sentence:"); 
			ASCIISentence(str); 
		} 
	} 

