public class LeapYear {
//    program to check given year number is leap or not

    public void checkLeap(int year) {

        if(year%4==0) {
            System.out.println("It is a leap year "+year);
        } else {
            System.out.println("It is not a leap year "+year);
        }
    }

    public static void main(String[] args) {
        LeapYear ly= new LeapYear();
        ly.checkLeap(1992);
    }
}
