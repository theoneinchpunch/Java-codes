package simple;

import java.util.Scanner;

public class forloop {
	//multiplication table of any number
	public static void main(String arg[]) {
		System.out.println("Enter the number for the multiplication table");
		Scanner scn = new Scanner(System.in);
		int a= scn.nextInt(),count=1;
		while(count != 11) {
			System.out.println(a+" * "+ count +" = "+ a*count);
			count++;
		}
		
	}

}
