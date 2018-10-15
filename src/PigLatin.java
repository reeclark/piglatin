import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y", input = "";

		System.out.println("Welcome to the Pig Latin Translator!");

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Enter a line to be translated: ");
			scan.hasNextLine();
			input = scan.nextLine();
			input = input.toLowerCase();

//			String[] space = input.split(" ");
//			for (int i = 0; i < space.length; i++) {
//				
//			}

			System.out.println(vowl(input).toLowerCase());

			System.out.println("Translate another line? (y/n)");
			scan.hasNextLine();
			cont = scan.nextLine();
		}
		System.out.println("Bye!");
		scan.close();
	}

	public static String vowl(String vowl) {
		vowl = vowl.toLowerCase();
		char c = vowl.charAt(0), c1 = vowl.charAt(1), c2 = vowl.charAt(2);// c3 = vowl.charAt(3);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			vowl = vowl.concat("way");
		} else if ((c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')
				&& (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u')) {
			vowl = vowl.substring(1) + c + "ay";
		} else if ((c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u')
				&& (c1 != 'a' || c1 != 'e' || c1 != 'i' || c1 != 'o' || c1 != 'u')
				&& (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u')) {
			vowl = vowl.substring(2) + c + c1 + "ay";
		} else {
			vowl = vowl.substring(3) + c + c1 + c2 + "ay";
		}

		return vowl;
	}

}
