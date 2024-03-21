import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice;

            do {
                System.out.println("------------------------------------------------");
                System.out.println("Choose what operation you want to perform:");
                System.out.println("A. Convert from any system to the decimal system");
                System.out.println("B. Convert from decimal system to another system");
                System.out.println("C. Summing up numbers from different systems");
                System.out.println("D. Subtracting numbers from different systems");
                System.out.println("E. Multiplying numbers from different systems");
                System.out.println("F. Dividing numbers from different systems");
                System.out.println(" ");
                System.out.println("W. Exit the program");
                System.out.println("------------------------------------------------");
                System.out.print("Enter your choice: ");

                choice = scanner.next().toUpperCase().charAt(0);

                switch (choice) {
                    case 'A':
                        System.out.print("Enter the base of the number system (2, 3, 4, 5, 6, 8, 9, 10, 16): ");
                        int base = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter the number in that system to convert to decimal: ");
                        String number = scanner.nextLine();
                        int decimalNumber = Integer.parseInt(number, base);
                        System.out.println("The decimal conversion is: " + decimalNumber);
                        break;

                    case 'B':
                        System.out.print("Enter the decimal number to convert: ");
                        int decimalNumberB = scanner.nextInt();
                        System.out.print("Enter the base of the target number system (2, 3, 4, 5, 6, 8, 9, 10, 16): ");
                        int baseB = scanner.nextInt();
                        scanner.nextLine();
                        String convertedNumber = Integer.toString(decimalNumberB, baseB);
                        System.out.println("The number in base " + baseB + " is: " + convertedNumber);
                        break;

                    case 'C':

                        break;
                    case 'D':

                        break;
                    case 'E':

                        break;
                    case 'F':

                        break;
                    case 'W':
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }

            } while (choice != 'W');
            scanner.close();
        }

}
