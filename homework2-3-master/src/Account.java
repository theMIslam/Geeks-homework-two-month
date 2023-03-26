public class Account {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы сняли со счета: " + sum);
    }

    public void withDraw(int sum) throws AmountException {
        if (amount < sum) {
            throw new AmountException("на вашем счету недостаточно средств:", amount);
        } else {
            System.out.println("Вы можете снять со счета: "+sum);
            amount -= sum;
            System.out.println("Вы сняли со счета: " + sum);
        }


    }



}