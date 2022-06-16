package oops;

public class Gpay {
    public String gId;
    public String name;
    public int upiPin;
    public long mobileNo;

    public int linkAccNo;

    public Gpay(String gId, String name) {
        this.gId = gId;
        this.name = name;
        System.out.println("Google pay ID: "+this.gId );
        System.out.println("Googlepay name: "+this.name);
    }

//    public int getUpiPin() {
//        return upiPin;
//    }

    public void setUpiPin(int upiPin) {
        this.upiPin = upiPin;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getLinkAccNo() {
        return linkAccNo;
    }

    public void setLinkAccNo(int linkAccNo) {
        this.linkAccNo = linkAccNo;
    }
}
