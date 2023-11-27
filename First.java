package programs;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intInput;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type an integer :");
		intInput = scanner.nextInt();
		
		System.out.println("You type "+intInput);
		
		
		float floatIInput;	
		
	
		System.out.print("Please type an float :");
		floatIInput = scanner.nextFloat();
		
		System.out.println("You typed "+floatIInput);
		

		//Challenge - Try accepting text input
		String strIInput;	
		
		
		System.out.print("Please type a line of text :");
		strIInput = scanner.next();
		
		System.out.println("You typed "+strIInput);
		
		char charInput;
		System.out.print("Please type a  single char :");
		String  tempStr = scanner.next();
		charInput = tempStr.charAt(0);
		
		System.out.println("You typed a char "+charInput);
	}

	}


