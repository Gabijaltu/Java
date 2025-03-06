public class CheckingAccount extends Account{

    private double overdraftLimit;

    public CheckingAccount(){
    }

    @Override
    public void withdraw(double withdraw) {
        if(withdraw > overdraftLimit){
            getBalance();
        }
        setBalance(getBalance() - withdraw);
    }



}
