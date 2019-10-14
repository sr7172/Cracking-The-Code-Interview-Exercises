import java.util.Scanner;

/**
 * Java program that implements an algorithm and checks if
 * a string has all unique characters or not
 * @author sr717
 *
 */
public class UniqueChars {

	public static void main(String[] args) {
		
		String my_string = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		my_string = in.nextLine();
		
		UniqueChars ob= new UniqueChars();
		if (ob.uniqueChars(my_string) == false){
			System.out.println("The string "+ my_string+" has duplicate characters");
		}
		else {
			System.out.println("The string "+ my_string+" has all unique characters");
		}
		
	}
		static boolean uniqueChars(String str)
		{
			if (str.length() > 128) {
				return false;
			}// end of if
			
			boolean[] chars = new boolean[128];
			for (int count = 0; count < str.length(); count++) {
				int val = str.charAt(count);
				System.out.println(chars[val]);
				if (chars[val]) { //char found 
					return false;
				}
				chars[val]= true;
			}
			return true;
		}
}

/**
 * Time complexity of the given algorithm can be explained as: O(n), where n is the length of the given string. 
 * In order to find if the string has duplicate characters, the loop iterates through the characters of the string 
 * until a duplicate character is found. If a duplicate character is found returns true and stops. 
 * However, even if a duplicate character is not found, the loop still iterates through the string.
 */
