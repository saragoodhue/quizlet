package quizlet;
import java.util.ArrayList;
import java.util.Scanner;
public class quizletRunner {
	static ArrayList<quizlet>Flashcards = new ArrayList<quizlet>();
	static int numOfCards;
	static String term;
	static String definition;

	public static void main(String[] args) {
		setUp();
	}
	public static void setUp() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This is a program similar to quizlet. You will enter a term and a definition.");
		System.out.println();
		System.out.println("How many flashcards do you want to make?");
		numOfCards = scanner.nextInt();
		System.out.println("You know will input your flashcards.");
		System.out.println();
		scanner.nextLine();

		
		for(int i = 0; i <= numOfCards; i++) {
			System.out.println("Enter the term:");
			term = scanner.nextLine();
			System.out.println("Enter the definition:");
			definition = scanner.nextLine();
			Flashcards.add(new quizlet("term", "definition"));
		}
	}
	public static void menu() {
		
	}

}
