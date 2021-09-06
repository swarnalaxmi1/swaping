package swaping;

public class swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		if(a<b) {
			System.out.println("swaping done");
		}
		else
		{
			System.out.println("swaping not done");
		}
		

	}

}
