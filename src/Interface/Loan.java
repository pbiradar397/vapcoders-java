package Interface;

public interface Loan {
   void carLoan(float roi);

   void homeLoan(float roi);

   default public void withdraw(int amount) {
      System.out.println("Loan Amount withdrawn: " + amount);
   }

//    default void carLoan(float roi) {
//        System.out.println("rate of interst: "+roi);
//    }
}
