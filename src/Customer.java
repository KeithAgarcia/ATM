

/**
 * Created by Keith on 3/31/17.
 */
public class Customer {
    String name;

    public void chooseName() {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        System.out.println("Welcome, Keith!");
    }

}
