
public class Abclogo {

	public static void main(String[] args) {
		for(int i=0;i<16;i++)
		{
			for(int j=0;j<26;j++)
			 {
				if  ( i==0 && j>17 && j<27 && j!=21 
					  || i==1 && j>13 && j<26 && j!=15 &&j!=17&&j!=18&&j!=23
					  || i==2 && j>11 && j<25 && j!=14&& j!=19 &&j!=20&&j!=21
					  || i==3 && j>9 && j<22 && j!=11&& j!=16 &&j!=17
					  || i==4&& j>7 && j<19 && j!=10
					  || i==5&& j>5 && j<20 && j!=8&& j!=3&& j!=14&& j!=15   
					  || i==6&& j>4 && j<20 && j!=11&& j!=12&& j!=13&& j!=14 
					  || i==7&& j>3 && j<20
					  || i==8&& j>2 && j<20
					  || i==9 && j>1 && j<20&& j!=10&& j!=11
					  || i==10 && j>0 && j<18&& j!=9
					  || i==11 && j>=0 && j<10
					  || i==12 && j>=0 && j<8
					  || i==13 && j>=0 && j<20 && j!=8 &&j!=9&&j!=10&&j!=11&& j!=12 &&j!=13&&j!=14&&j!=15 
					  || i==14&& j>0 && j<19&& j!=9
					  || i==15&& j>2 && j<12
						)
				             {
					           System.out.print("*");
			                  }
				          else
				              {
					          System.out.print(" ");
				              }
				
				
				}
			System.out.println();
			      }

	}

}
