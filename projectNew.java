import java.util.Scanner;

public class projectNew {

    public static void main(String[] args) {
        projectNew calculator = new projectNew(); // Create an instance of the class
        calculator.simpleCalculator();            // Call the method
    }

    public void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        String continueCalculator;

        do {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please choose +, -, *, or /.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to perform another calculation? (yes/no):");
            continueCalculator = scanner.next();

        } while (continueCalculator.equalsIgnoreCase("yes"));

        System.out.println("Calculator session ended. Goodbye!");
        scanner.close();
    }
}
