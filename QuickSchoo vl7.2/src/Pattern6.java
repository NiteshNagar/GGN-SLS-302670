import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		System.out.println("Enter a password: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		System.out.println(s);
		char[] iptochar = s.toCharArray();
       
		int len = s.length();
		System.out.println("Length of string is = " + len);
		int[] array = new int[len];
		for (int i = 0; i < len ; i++) {
			int matched=0;
			for (int j = i+1; j < len; j++) {
				if(matched==1&&iptochar[i] == iptochar[j])
					array[j]=1;
				if (iptochar[i] == iptochar[j]&&array[j]==0&&matched==0) {
					matched=1;
					array[j]=1;
					System.out.print(iptochar[i]);
				}
			
			}
			
		//	System.out.println(+freq);

			/*
			 * if (iptochar[i] == iptochar[i + 1]) {
			 * System.out.println(iptochar[i]); }
			 */
			// System.out.print(iptochar [i]);
		}

	}

}
