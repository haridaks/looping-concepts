package Looping;

public class ContinueLoop {

	public static void main(String[] args) {
		// Used to skip the condition
		
		for(int i=1;i<=10;i++) {
		  if(i==3) {
			  continue; //skipping 3
		  }
		  System.out.println(i);
		}
	}

}
