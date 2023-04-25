package lib;

//import com.gl.bal.brackets.BalancingBrackets;

import java.util.Scanner;

import com.gl.bal.brackets.BalancingBrackets;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string of brackets: ");
		String input = sc.nextLine();

		if (BalancingBrackets.isBalanced(input)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets.");
		}
		sc.close();
	}

}