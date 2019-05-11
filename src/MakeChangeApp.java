import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for value, and get input
		System.out.print("How much does it cost?  $");
		double cost = input.nextDouble();
		
		//Prompt for amount tendered (give back to customer)
		System.out.print("How much are you paying?  $");
		double tendered = input.nextDouble();
		
		
		//to little or same amount
		while (tendered < cost) {
			System.out.println("Need more paper, Dude!");
			System.out.println("Enter more money!");
			tendered += input.nextDouble();
		} 
		if (tendered == cost) {
			System.out.println("Exact amount given!");
		} 
		//diff equation
		int diff = (int)(((tendered - cost) + 0.001) * 100);
		
		// figure out how to do change.
		//20 buckaroos
		if (diff > 2000) {
			int twenty = diff / 2000;
			diff = diff % 2000;
			System.out.println("Twenties: " + twenty);
		}
		//10 bucks
		if (diff > 1000) {
			int tens = diff / 1000;
			diff = diff % 1000;
			System.out.println("Tens: " + tens);
		}
		//5 bucks
		if (diff > 500) {
			int fives = diff / 500;
			diff = diff % 500;
			System.out.println("Fives: " + fives);
		}
		//1 buck
		if (diff > 100) {
			int dollar = diff / 100;
			diff = diff % 100;
			System.out.println("Dollar: " + dollar);
		}
		//25 cents
		if (diff > 25) {
			int twentyFive =  diff / 25;
			diff = diff % 25;
			System.out.println("Quarter: " + twentyFive);
		}
		//10 cents
		if (diff > 10) {
			int tenCents = diff / 10;
			diff = diff % 10;
			System.out.println("Dimes: " + tenCents);
		}
		//5 cents
		if (diff > 5) {
			int fiveCents = diff / 5;
			diff = diff % 5;
			System.out.println("Nickel: " + fiveCents);
		}
		//1 cent
		if (diff >= 1) {
			int oneCent = diff / 1;
			System.out.println("Penny: " + oneCent);
		}
		
		
		
		input.close();
	}
}
