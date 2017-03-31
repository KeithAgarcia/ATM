import java.util.Scanner;//Where do I import this again?

public class ATM {
    public static Scanner scanner = new Scanner(System.in);
    public static Customer customer = new Customer();
    public static Option option = new Option();

    public static void main(String[] args)throws Exception {

        customer.chooseName();
        option.chooseOption();
        }

    }

