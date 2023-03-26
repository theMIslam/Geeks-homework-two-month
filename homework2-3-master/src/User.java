public class User {
    public static void main(String[] args) {

        Account MBank = new Account();
        MBank.deposit(20000.00);
        while (true) {
            try {
                MBank.withDraw(6000);
            } catch (AmountException e) {
                try {
                    MBank.withDraw((int) e.getRemainingAmount());
                } catch (AmountException ex) {
                    ex.printStackTrace();
                }
                break;
            }
        }
    }
}