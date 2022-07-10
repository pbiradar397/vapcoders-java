package Interface;

public abstract class Bank {

    public void accountDetails(String name, long accNumber) {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNumber);
    }

}
