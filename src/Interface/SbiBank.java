package Interface;

public class SbiBank extends Bank implements Loan, Deposit {
    public void deposit(int amount) {
        super.accountDetails("priyanka", 1234547678);
//        Deposit.super.wtihdraw(6000);
//        Loan.super.withdraw(70000);

    }

    @Override
    public void fixedDeposit(int amount, float roi) {


        System.out.println("Amount to be deposited: " + amount);
        System.out.println("interest rate for FD: " + roi);
        Deposit.super.wtihdraw(60000);
    }

    @Override
    public void recurringDeposit(int amount, int duration) {
        System.out.println("Monthly amount to deposit: " + amount);
        System.out.println("Duration in years of RD to return: " + duration);

    }

    @Override
    public void carLoan(float roi) {
        System.out.println("Car loan interest rate: " + roi);
        Loan.super.withdraw(70000);


    }

    @Override
    public void homeLoan(float roi) {
        System.out.println("Home loan interest rate " + roi);
    }
}

class Test {
    public static void main(String[] args) {

        SbiBank sb = new SbiBank();
        sb.deposit(5000);
        sb.fixedDeposit(6000, 5.0f);
        sb.recurringDeposit(10000, 5);

        sb.carLoan(7.5f);
        sb.homeLoan(10.25f);

    }
}

