package kbc;

import java.util.Scanner;

public class KBCLogic {

	Question questionsArray[] = new Question[15]; // becoz array is fixed size collection

	public KBCLogic() {
              // Data Layer
		Question q1 = new Question("What is the Capital of India",
				new String[] { "New Delhi", "Mumbai", "Banglore", "New York" }, 1,
				"New Delhi is Very old City of India");

		Question q2 = new Question("1+1", new String[] { "0", "2", "8", "9" }, 2, "Basic Maths");

		questionsArray[0] = q1;
		questionsArray[1] = q2;

	}

	public void startGame() {
		
		   // Controller 
		for (int i = 0; i < 2; i++) {
			
			Question currentQuestion = questionsArray[i];
			System.out.println(currentQuestion.getQuestionString());

			String currentQuestionOptionArray[] = currentQuestion.getOption();
			for (int j = 0; j < 4; j++) {
				System.out.println((j + 1) + " : " + currentQuestionOptionArray[j]);
			}

			int userAnswer = new Scanner(System.in).nextInt();
			if (userAnswer == currentQuestion.getCorrectAnswer()) {
				continue;
			} else {
				break;

			}

		}
	}

}
