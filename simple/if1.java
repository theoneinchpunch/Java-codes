package simple;

import java.util.Scanner;

public class if1 {
	public static void main(String argg[]) {
		System.out.println("Enter your usser name :");
		Scanner sr = new Scanner(System.in);
		String us =sr.nextLine();
		String user="sabin";
		if(user.equals(us)) {
		 System.out.println("Welcome SABIN");
		}
		else {
			 System.out.println("Who the fuck are you!!!!");

		}
	}

}
