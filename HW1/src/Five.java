import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5 입력받고 출력하깅
		String choice;
		
		System.out.println("choose one of the following.");
		System.out.println("apple\n" + "orange\n" + "banana\n" + "peach");
		System.out.print("enter your choice here");
		Scanner input = new Scanner(System.in); 
		choice = input.nextLine();
		switch (choice) {
		case "apple":
			System.out.println("Your choice is apple");
			break;
		case "orange":
			System.out.println("Your choice is orange");
		case "banana":
			System.out.println("Your choice is banana");
		case "peach":
			System.out.println("Your choice is peach");
		}
	}
}