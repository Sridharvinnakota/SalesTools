package ca.dem0;

public class SalesTool {
	public static void greetings() {
		System.out.println("This app shows sales data");
	}

	public static void main(String[] args) {
		greetings();
		Demo d = new Demo();
		d.salesData();
	}

}
