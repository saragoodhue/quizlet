package quizlet;

import java.util.Arrays;

public class matching
	{

		public static void match()
			{
				System.out.println("Match the term with it's definition");

				for (int i = 0; i < quizletRunner.numOfCards; i++)
					{
						int[] indexArray;
						int index = (int) (Math.random() * quizletRunner.Flashcards.size());
						if (Arrays.asList(indexArray).contains(index))
							{
								index = (int) (Math.random() * quizletRunner.Flashcards.size());
							} else if (!Arrays.asList(indexArray).contains(index))
							{
								indexArray={index};
							}

						System.out.println((quizletRunner.Flashcards.get(index).getTerm()));

					}
			}

	}
