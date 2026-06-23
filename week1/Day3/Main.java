package week1.Day3;

public class Main {

    public static void main(String[] args) {

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {

            System.out.print("Enter your account balance: ");
            double balance = scanner.nextDouble();

            ValidationResult result = ATMMENU.validateBalance(balance);

            if (!result.isValid()) {
                System.out.println("Error: " + result.getMessage());
                return;
            }

            ATMMENU atmMenu = new ATMMENU(balance);

            boolean running = true;

            while (running) {

                atmMenu.displayMenu();

                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                double amount = 0;

                if (choice == 2 || choice == 3) {
                    System.out.print("Enter amount: ");
                    amount = scanner.nextDouble();
                }

                atmMenu.performAction(choice, amount);

                if (choice == 4) {
                    running = false;
                }

                System.out.println();
            }
        }
    }
}