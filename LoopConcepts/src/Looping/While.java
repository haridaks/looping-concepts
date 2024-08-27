package Looping;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		int n = sc.nextInt();
		
		int counter=1;
		
		while(counter<=n) {
			System.out.println(counter);
			counter++;
		}
		
		int counter1=1;
		while(counter1<=n) {
			System.out.println("****");
			counter1++;
		}

	}

}
