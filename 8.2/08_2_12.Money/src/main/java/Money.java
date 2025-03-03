
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public int getEuros() {
        return euros;
    }

    public int getCents() {
        return cents;
    }

    public Money plus(Money addition) {


        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;

    }

    public boolean lessThan(Money compared) {

        return getEuros() < compared.getEuros() || getEuros() == compared.getEuros() && getCents() < compared.getCents();

    }

    public Money minus(Money decreaser) {

        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;

        if (totalEuros < 0) {
            return new Money(0, 0);
        }

        if (decreaser.cents > this.cents){

            totalEuros -= 1;

            totalCents += 100;
        }

        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
