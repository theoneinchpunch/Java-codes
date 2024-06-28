package simple;

import java.util.Scanner;

public class functions {
	public static void main(String arg[]) {
		
		hell();
		Scanner sc= new Scanner(System.in) ;
		int m= sc.nextInt();
		int n=2;
		System.out.println( divider(m,n) );
		
	}
	public static void hell() {
		System.out.println("hello world");
	}
	public static int divider(int a, int b) {
		return a/b;
	}

}
