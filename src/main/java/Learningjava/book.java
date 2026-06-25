package Learningjava;

public final class book implements Comparable {

	int price;
	public book(int price) 
	{
		super();
		this.price=price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book b1=new book(100);
		
		book b2=new book(200);
		//System.out.println(b2);
		System.out.println(b2.toString());
		System.out.println(b2.hashCode());
		
		System.out.println(b1.equals(b2));//compare address
		System.out.println(b1.price==b2.price);//compare states
		System.out.println(b1.price-b2.price);
		System.out.println(b1.compareTo(b2));
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		book b3=(book)o;//downcasting
		return this.price-b3.price;
	}

}
