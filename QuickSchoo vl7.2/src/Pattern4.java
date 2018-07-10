import java.util.Scanner;

public class Pattern4 {
	/* Reverse String 
	 * 
	 *Code for Convert string to char*/ 
	
	 /* public static void main(String[] args) {

	 * 
	 * System.out.println("enter the string."); Scanner in = new
	 * Scanner(System.in); String num_rows = in.next(); in.close();
	 * 
	 * char[] hello = num_rows.toCharArray();
	 * 
	 * String Name = "Nitesh"; System.out.println("Name= ", +Name);
	 */

	public static void main(String[] args) {
		System.out.println("Enter a password: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		System.out.println(s);
        char[] iptochar = s.toCharArray();
        
		int len = s.length();
		System.out.println("Length of string is = " + len);
		
		
		for (int i = len-1; i >= 0; i--) {
			System.out.print(iptochar [i]);
		}

	}
}
