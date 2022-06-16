package oops;

public class Test {
    public static void main(String[] args) {
        Gpay g = new Gpay("101","PriyaB");
        g.setUpiPin(565656);
        g.setMobileNo(988561234);
        g.setLinkAccNo(789456123);
        System.out.println();
        System.out.println("Mobile no:"+g.getMobileNo());
        System.out.println("Account details:"+g.getLinkAccNo());


    }




}
