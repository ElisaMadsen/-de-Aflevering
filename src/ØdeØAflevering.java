import java.util.Scanner;

public class ØdeØAflevering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Welcome to user
        System.out.println("Hi! Which of these items do you want to take with you on a deserted island?🏝");

//10 options for user
        String[] options = {"1. tent", "2. alcohol", "3. knife", "4. gameboy", "5. sewingkit", "6. harmonica", "7. music", "8. matches", "9. book", "10. pet"};
        int [] optionsIndex = new int[10];
//Printing the options for user to choose from
        for (String option : options) {
            System.out.println(option);
        }
//Get 10 inputs from user
        System.out.println("Type the number of your choice: ");

//Kan ændres til while loop, hvis der er tid.
//Det er så useren kan give ti input, også hvis man svarer forkert
        for (int i = 1; i <= 10; i++) {
            int userInputs = scanner.nextInt();
            System.out.println(i);

            optionsIndex[userInputs-1] ++;

            if (userInputs > options.length) {
                System.out.println("Your choice is not available");
            }
        }
//Putting inputs from user into an int array
        for (int option : optionsIndex) {
            System.out.print(option + ", ");
        }
        System.out.println();

        int maximum = optionsIndex[0];
        int mostChosenElement = 0;
        for (int i = 0; i < options.length; i++) {
            int currentElement = optionsIndex[i];
            if (currentElement > maximum){
                maximum = currentElement;
                mostChosenElement = i;
            }
        }
//If two items have the same amount of votes, the console will show both elements
        String moreThanTwoChosenElements = "";

        int mostChosenValue = optionsIndex[mostChosenElement];

        for (int i = 0; i < options.length; i++) {
            if (mostChosenValue == optionsIndex[i]){
                moreThanTwoChosenElements += options[i] + ", ";
            }
        }

        System.out.println("\n" + moreThanTwoChosenElements + "is the most frequent item(s) that was chosen");

        }

    }

