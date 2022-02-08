package quizlet;

import java.util.Scanner;

public class flashcards
	{

		public static void main(String[] args)
			{
				studyFlashcards();
			}

		public static void studyFlashcards()
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Do you want to review with the term or definition?");
				String choice;
				choice = input.nextLine();

				if (!choice.equals("Term") && !choice.equals("Definition"))
					{
						System.out.println("Not a valid entry, enter Term or Definition");
						choice = input.nextLine();
					}
				
				if (choice.equals("Term"))
					{
						for(int i = 0; i <= quizletRunner.numOfCards; i++)
							{
								
							}
					}

				else if (choice.equals("Definition"))
					{

					}

			}

	}
