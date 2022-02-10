package quizlet;

import java.util.Scanner;

public class flashcards
	{
	static int counterRight = 0;
	static int counterWrong = 0;

		public static void studyFlashcards()
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Do you want to review with the Term or Definition?");
				String choice;
				choice = input.nextLine();

				if (!choice.equals("Term") && !choice.equals("Definition"))
					{
						System.out.println("Not a valid entry, enter Term or Definition");
						choice = input.nextLine();
					}
				
				if (choice.equals("Term"))
					{
						for(int i = 0; i < quizletRunner.numOfCards; i++)
							{
								System.out.println();
								System.out.println(quizletRunner.Flashcards.get(i).getTerm());
								System.out.println("What is the definition?");
								Scanner def = new Scanner(System.in);
								String userDef;
								userDef = def.nextLine();
								
								if(!userDef.equals(quizletRunner.Flashcards.get(i).getDefinition()))
									{
										System.out.println("Sorry, that is not the definition you entered!");
										counterWrong++;
										System.out.println("Your percent of correct responses is: " + counterRight/(counterWrong + counterRight));
									}
								
								else if(userDef.equals(quizletRunner.Flashcards.get(i).getDefinition()))
									{
										System.out.println("You got it!");
										counterRight++;
										System.out.println("Your percent of correct responses is: " + counterRight/(counterWrong + counterRight));
									}
								
							}

						quizletRunner.menu();

					}

				else if (choice.equals("Definition"))
					{
						for(int i = 0; i < quizletRunner.numOfCards; i++)
							{
								System.out.println();
								System.out.println(quizletRunner.Flashcards.get(i).getDefinition());
								System.out.println("What is the term?");
								Scanner term = new Scanner(System.in);
								String userTerm;
								userTerm = term.nextLine();
								
								if(!userTerm.equals(quizletRunner.Flashcards.get(i).getTerm()))
									{
										System.out.println("Sorry, that is not the definition you entered!");
										counterWrong++;
										System.out.println("Your percent of correct responses is: " + counterRight/(counterWrong + counterRight));
									}
								
								else if(userTerm.equals(quizletRunner.Flashcards.get(i).getTerm()))
									{
										System.out.println("You got it!");
										counterRight++;
										System.out.println("Your percent of correct responses is: " + counterRight/(counterWrong + counterRight));
									}
							}
						quizletRunner.menu();

					}

			}

	}
