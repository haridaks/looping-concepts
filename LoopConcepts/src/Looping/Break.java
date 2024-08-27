package Looping;

public class Break {

	public static void main(String[] args) {
		//Break statement is used to come out of the condition
		
		for(int i=1;i<=5;i++) {
			if (i==3) {
				break;
			}
			System.out.println("Bye");
		}
		System.out.println("Hi");

	}

}
