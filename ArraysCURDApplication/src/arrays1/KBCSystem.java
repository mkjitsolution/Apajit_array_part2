package arrays1;

import java.util.Scanner;

public class KBCSystem {
	
	String questions[] = new String[3];
	//String options[20];
	String options[][] = new String[3][4];
	String correctAnswers[] = {"a","b","c"};
	int price = 0;
	Scanner sc = new Scanner(System.in);
	
	public KBCSystem() {
	   // fill arrays
	
		questions[0] = "What is the Capital of India";
		questions[1] = "1+1";
		questions[2] = "Who is Virat Kohli";
		
		options[0][0] = "a. New Delhi";
		options[0][1] = "b. Mumbai";
		options[0][2] = "c. Banglore";
		options[0][3] = "d. New York";
		
		options[1][0] = "a.0";
		options[1][1] = "b.2";
		options[1][2] = "c.8";
		options[1][3] = "d.-1";
		
		options[2][0] = "a. Actor";
		options[2][1] = "b. Story teller";
		options[2][2] = "c. Cricketer";
		options[2][3] = "d. Runner";
	}
	
	public void startGame()
	{
		for(int i = 0;i<questions.length;i++)
		{
			System.out.println(questions[i]);
			for(int j=0;j<4;j++)
			{
				System.out.println(" "+options[i][j]);
			}
			System.out.println(" User Answer :- ");
			String userAnswer = sc.nextLine();
			
			if(userAnswer.equals(correctAnswers[i]))
			{
				price += 1000;
				continue;
			}
			else
			{
				System.out.println("Wronmg Answer");
				break;
			}
			
		}
	}
	
	public int getPrice()
	{
		return price;
	}

}
