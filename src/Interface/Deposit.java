package Interface;

public interface Deposit {

    void fixedDeposit(int amount, float roi);

    void recurringDeposit(int amount, int duration);

    default public void wtihdraw(int amount) {
        System.out.println("Amount to withdraw after Deposit: " + amount);
    }
}
