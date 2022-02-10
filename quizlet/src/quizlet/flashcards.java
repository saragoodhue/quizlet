package quizlet;

import java.util.Scanner;

public class flashcards
	{
	static double counterRight;
	static double counterWrong;
	static double grade;

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
										grade = counterRight/(counterWrong + counterRight)*100;
										System.out.println("Your percent of correct responses is: ");
										System.out.printf("%.2f", grade);
										System.out.print("%");
									}
								
								else if(userDef.equals(quizletRunner.Flashcards.get(i).getDefinition()))
									{
										System.out.println("You got it!");
										counterRight++;
										grade = counterRight/(counterWrong + counterRight)*100;
										System.out.println("Your percent of correct responses is: ");
										System.out.printf("%.2f", grade);
										System.out.println("%");
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
										grade = counterRight/(counterWrong + counterRight)*100;
										System.out.println("Your percent of correct responses is: ");
										System.out.printf("%.2f", grade);
										System.out.print("%");
									}
								
								else if(userTerm.equals(quizletRunner.Flashcards.get(i).getTerm()))
									{
										System.out.println("You got it!");
										counterRight++;
										grade = counterRight/(counterWrong + counterRight)*100;
										System.out.println("Your percent of correct responses is: ");
										System.out.printf("%.2f", grade);
										System.out.println("%");
									}
							}
						quizletRunner.menu();

					}

			}

	}
