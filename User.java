public class User {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public User(double balance) {
        this.balance = balance;
    }
    public void insertArgent(double mount){
        balance += mount;
    }
    public void deductArgent(double mount){
        balance -= mount;
    }
}
