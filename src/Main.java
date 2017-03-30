import java.util.Scanner;//Where do I import this again?

public class Main {

    public static void main(String[] args)throws Exception {
            System.out.println("Hello, what is your name?");

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Please re-enter name.");
                String newName = scanner.nextLine();
                System.out.println("Hi " + newName);
            }
            else if (name.equalsIgnoreCase(name)) {
                System.out.println("Hi " + name);
            }

            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("Press 1 to Check my balance");
            System.out.println("Press 2 to Add funds");
            System.out.println("Press 3 to Withdrawal funds");
            System.out.println("Press 4 to cancel");
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Your balance is $100");
                System.out.println();
                System.out.println("Thank you and please come again!");
                System.exit(0);
            }
            else if (option.equals("2")){
                System.out.println("How much money would you like to deposit?");
                System.out.print("$");
                String deposit = scanner.nextLine();
                System.out.println(("Your deposit is $") + deposit);
                int amount = Integer.parseInt(deposit);
                System.out.println(("Your remaining balance is $") + (amount +100));
                System.out.println();
                System.out.println("Thank you and please come again!");
                System.exit(0);
            }
            else if (option.equals("3")) {
                System.out.println("How much money would you like to withdrawal?");
                System.out.print("$");
                String withdrawal = scanner.nextLine();
                System.out.println("You have withdraw is $" + withdrawal);
                int amount = Integer.parseInt(withdrawal);
                System.out.println("You're remaining balance is $" + (100 - amount));
                System.out.println();
                System.out.println("Thank you and please come again!");
                System.exit(0);
            }
            else if (option.equals("4")){
                System.out.println("Thank you and please come again!");
                System.exit(0);
            }
            else
                System.out.println("You have pressed an incorrect key. Please try again.");
            System.exit(0);
        }

    }

