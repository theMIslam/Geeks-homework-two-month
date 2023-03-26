public class AmountException extends Exception {

    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public AmountException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;

    }


}