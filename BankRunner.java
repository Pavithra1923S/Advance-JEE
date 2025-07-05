public class BankRunner {
    public static void main(String[] args) {
        Bank bank = () -> {
            System.out.println("Money is being deposited in the bank");
        };
        bank.deposit();
    }
}
