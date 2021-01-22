package edu.wctc;

import java.util.Scanner;

public class Main {

    public static int addPoints(int [] points) {
        int sum = 0;
        for (int i : points) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int answer = 0;
        boolean play = true;
        int totalPoints = 0;
        String[] questions = {
                "Mild (0) or Spicy (1): ",
                "Tea (0) or Coffee (1): ",
                "Breakfast (0) or Brunch (1): ",
                "Summer (0) or Winter (1): ",
                "Paper (0) or Plastic (1): " };
        //Main loop
        while (play) {
            System.out.print("Welcome to the quiz! Please answer only 0 or 1 for your respective choice.\n");
        //Initialize response array to zeros
            int[] responses = {0,0,0,0,0};
        //Loop to ask questions
            for (int i = 0; i < questions.length; i++) {
                System.out.print(questions[i]);
                answer = input.nextInt();
                if (answer == 0)
                    responses[i] = 0;
                else {
                    if (answer == 1)
                        responses[i] = 1;
                    else {
                        System.out.print("You entered an invalid response. Shame on you. You get 0.\n");
                        responses[i] = 0;
                    }
                }
            }
            //Total responses
            totalPoints = addPoints(responses);

            //Output results
            System.out.print("Here are your results!\n");
            System.out.printf("Your total points = %d\n", totalPoints);
            if (totalPoints < 3)
                System.out.print("You prefer life to be calm and organized.\n");
            else {
                if (totalPoints > 3)
                    System.out.print("You prefer life to be spontaneous and active.\n");
                else{
                        System.out.print("You prefer a good balance in life.\n");
                }
            }
            // Play again?
            System.out.print("Do you want to play again? No (0) or Yes (1): ");
            if (input.nextInt() == 0)
                play = false;
        }

    }
}
