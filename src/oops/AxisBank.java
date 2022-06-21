package oops;

public class AxisBank extends Bank {

    public int deposit;
     public int withdraw;

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
        balance += deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
        balance -= withdraw;
    }

    public static void main(String[] args) {

        AxisBank ab= new AxisBank();

        ab.setInterest(4);
        System.out.println("Interest rate: "+ab.getInterest());
        ab.setBalance(5000);

        System.out.println("Balance:"+ab.getBalance());

//        System.out.println();
        ab.setWithdraw(1000);

        System.out.println("amount withdrawn:"+ab.getWithdraw());
        System.out.println("balance after withdraw: "+ab.getBalance());

        ab.setDeposit(500);

        System.out.println("Amount Deposited:"+ab.getDeposit());

        System.out.println("balance after deposit: "+ab.getBalance());
    }


}
