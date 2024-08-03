import java.util.Scanner;

public class quizapp {
    public static void main(String[] args) {
        String[] questions = {
            "What's the capital city of India?",
            "Which programming language is popular for web development?",
            "Who's the mastermind behind Microsoft?"
        };

        String[][] answerChoices = {
            {"Delhi", "Mumbai", "Bangalore", "Chennai"},
            {"Java", "Python", "C++", "JavaScript"},
            {"Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Elon Musk"}
        };

        String[] correctAnswers = {"Delhi", "JavaScript", "Bill Gates"};

        Scanner input = new Scanner(System.in);
        int correctCount = 0;

        System.out.println("Welcome to the Quiz!");

        for (int questionNumber = 0; questionNumber < questions.length; questionNumber++) {
            System.out.println("\nQuestion " + (questionNumber + 1) + ":");
            System.out.println(questions[questionNumber]);

            for (int choiceNumber = 0; choiceNumber < answerChoices[questionNumber].length; choiceNumber++) {
                System.out.println((choiceNumber + 1) + ". " + answerChoices[questionNumber][choiceNumber]);
            }

            System.out.print("Your answer: ");
            int userChoice = input.nextInt();

            if (userChoice >= 1 && userChoice <= answerChoices[questionNumber].length) {
                if (answerChoices[questionNumber][userChoice - 1].equals(correctAnswers[questionNumber])) {
                    System.out.println("You got it right!");
                    correctCount++;
                } else {
                    System.out.println("Nope, the correct answer is: " + correctAnswers[questionNumber]);
                }
            } else {
                System.out.println("Invalid choice. Please pick a number from 1 to " + answerChoices[questionNumber].length + ".");
            }
        }

        System.out.println("\nQuiz over! You scored " + correctCount + " out of " + questions.length + ".");
    }
}
