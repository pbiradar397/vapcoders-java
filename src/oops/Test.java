package oops;

public class Test {
    public static void main(String[] args) {
//        Gpay g = new Gpay("101","PriyaB");
//        g.setUpiPin(565656);
//        g.setMobileNo(988561234);
//        g.setLinkAccNo(789456123);
//        System.out.println();
//        System.out.println("Mobile no:"+g.getMobileNo());
//        System.out.println("Account details:"+g.getLinkAccNo());

        Mobile mbl = new Mobile("4000mAh","dual",456123456);
        mbl.setCamera("40MP");
        mbl.setMemory("128GB");
        mbl.setModel("Samsung Galaxy PRO");
        mbl.setScreenSize("6 inches");
        mbl.setPrice(60000);
        mbl.getCamera();
        mbl.getMemory();
        mbl.getModel();
        mbl.getScreenSize();
        mbl.getPrice();







    }




}
