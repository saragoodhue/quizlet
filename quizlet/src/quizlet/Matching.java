package quizlet;

import java.util.ArrayList;
import java.util.Collections;


public class Matching
	{
		static int index;
		public static void match()
			{
				System.out.println("Match the term with its definition");
				int[] indexArray = new int[QuizletRunner.numOfCards];
				
				Collections.shuffle(QuizletRunner.Flashcards);
				int number = 1;
				//for (int i = 0; i < quizletRunner.numOfCards; i++)
				for(Quizlet q : QuizletRunner.Flashcards)
					{	
						System.out.print(number + ". ");
						System.out.println(q.getTerm());
						number++;
						//System.out.print((i + 1) + ". ");
						//System.out.println((quizletRunner.Flashcards.get(indexArray[i]).getTerm()));

					}

			}

	}
