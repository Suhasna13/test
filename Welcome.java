import java.util.Scanner; // Import the Scanner class

public class Welcome {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();

        // Prompt the user to enter their last name
        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        // Display the welcome message
        System.out.println("Welcome to the Second Year " + firstName + " " + lastName);

        // Close the scanner
        scanner.close();
    }
}

