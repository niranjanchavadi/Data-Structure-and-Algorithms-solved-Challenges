
public class Paterrn {

	public static void main(String[] args) {
		
		
		
		
		
		for (int i =0;i<8;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==0&&j>0&&j<4&&j!=0&&j!=4
					||j==0 && i>0
					||j==4&&i>0&&i<4
					||i==4&&j>0&&j<4
				    ||i==5&&j>1&&j<3
				    ||i==6&&j>2&&j<4
				    ||i==7&&j>3
					)
				{
				System.out.print("*");}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
