import java.util.Scanner;

public class ØdeØAflevering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Welcome to user
        System.out.println("Hi! Which of these items do you want to take with you on a deserted island?🏝");

//10 options for user
        String[] options = {"1. tent", "2. alcohol", "3. knife", "4. gameboy", "5. sewingkit", "6. harmonica", "7. music", "8. matches", "9. book", "10. pet"};

//Printing the options for user to choose from
        for (String option : options) {
            System.out.println(option);
        }
//Get 10 inputs from user
        System.out.println("Type the number of your choice: ");

//Kan ændres til while loop, hvis der er tid.
//Det er så useren kan give ti input, også hvis man svarer forkert
        for (int i = 1; i <= options.length; i++) {
            int userInputs = scanner.nextInt();
            System.out.println(i);

            if (userInputs > options.length) {
                System.out.println("Your choice is not available");
            }
        }
//


    }
}
