import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital city of South Africa?",
                "2. Who was the first democratically elected president of South Africa?",
                "3. What is the currency used in South Africa?",
                "4. In which year did South Africa host the FIFA World Cup?",
                "5. What is the national animal of South Africa?"
        };

        String[][] options = {
                {"A. Pretoria", "B. Johannesburg", "C. Cape Town", "D. Durban"},
                {"A. Thabo Mbeki", "B. Nelson Mandela", "C. Jacob Zuma", "D. Desmond Tutu"},
                {"A. Rand", "B. Dollar", "C. Pound", "D. Euro"},
                {"A. 2006", "B. 2010", "C. 2014", "D. 2018"},
                {"A. Springbok", "B. Elephant", "C. Lion", "D. Cheetah"}
        };

        char[] correctAnswers = {'A', 'B', 'A', 'B', 'A'};

        // Variables to track the score
        int totalQuestions = questions.length;
        int correctCount = 0;

        System.out.println("Welcome to the South African Quiz Game!");
        System.out.println("Please answer each question by typing A, B, C, or D.");
        System.out.println();

        // Loop through each question
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);

            // Display options for the current question
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Input validation loop
            char userAnswer;
            while (true) {
                System.out.print("Your answer: ");
                String input = scanner.nextLine().toUpperCase();
                if (input.length() == 1 && "ABCD".indexOf(input.charAt(0)) != -1) {
                    userAnswer = input.charAt(0);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter A, B, C, or D.");
                }
            }

            // Compare user answer to correct answer
            if (userAnswer == correctAnswers[i]) {
                correctCount++;
            }
            System.out.println();
        }

        // Calculate and display the final score
        double percentageScore = ((double) correctCount / totalQuestions) * 100;
        System.out.println("Quiz Complete!");
        System.out.println("Your Score: " + correctCount + "/" + totalQuestions + " (" + percentageScore + "%)");

        // Close the scanner
        scanner.close();
    }
}
