import java.util.*;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Enter your customer Id ");
		int customerId = scan.nextInt();
		System.out.println("Enter your account number:");
		int accountNumber = scan.nextInt();
		System.out.println("Enter the amount to be withdrawn");
		int amount = scan.nextInt();
		int ans = (amount < 50000) ? (50000-amount) : 50000;
		System.out.println(ans);
	}

}
