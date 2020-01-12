
class Heart
{
	int heartbeat;

	public Heart(int heartbeat) {
		super();
		this.heartbeat = heartbeat;
	}

	public int getHeartbeat() {
		return heartbeat;
	}
}
	class Brain
{
		int iq;

		public Brain(int iq) {
			super();
			this.iq = iq;
		}

		public int getIq() {
			return iq;
		}	
}	
	
	class Bike
{
		String brand;
		int milege;
		public Bike(String brand, int milege) {
			super();
			this.brand = brand;
			this.milege = milege;
		}
		public String getBrand() {
			return brand;
		}
		public int getMilege() {
			return milege;
		}		
}
 
	class Book
{
	String name;
	String author;
	
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}	
}
	class Human
{
		Heart h =new  Heart (70);
		
		
		void hasA(Bike b)
		
		{
			System.out.println(b.getBrand());
			System.out.println(b.getMilege());
		}		
}

	class Student1 extends Human
{
		Brain bn = new Brain(100);
		void hasA(Book bk)
		{
			System.out.println(bk.getAuthor());
			System.out.println(bk.getName());
		}
		
}

public class Launch2 {

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		Bike b  = new Bike("Honda", 67);
		Book bk = new Book("Java","Orelly");
		System.out.println(s.h.getHeartbeat());
        System.out.println(s.bn.getIq());
        s.hasA(b);
        s.hasA(bk);
	}
	

}
