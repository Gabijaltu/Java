
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money = 1000.0;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {

        if (sum > 0) {
            card.setBalance(card.getBalance() + sum);
            money = money + sum;
        }
    }


    public boolean eatAffordably (PaymentCard card) {
        if (card.getBalance() >= 2.5) {
            card.setBalance(card.getBalance() - 2.5);
            affordableMeals++;
            return true;
        } return false;
    }

    public boolean eatHeartily (PaymentCard card) {
        if (card.getBalance() >= 4.3) {
            card.setBalance(card.getBalance() - 4.3);
            heartyMeals++;
            return true;
        } return false;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.5) {
            money = money + 2.5;
            double change = payment - 2.5;
            affordableMeals++;
            return change;
        }
        double change = payment;
        return change;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3) {
            money = money + 4.3;
            double change = payment - 4.3;
            heartyMeals++;
            return change;
        }
        double change = payment;
        return change;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
