public class Increment {

    public void monthsInaYear() {
        int month = 12; //1,2,3,4,......12

        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Novemebr");
                break;
            case 12:
                System.out.println("December");
                break;
        default:
                System.out.println("Invalid month number entered");
                break;

        }


    }
}

//        int a = 4, b = 5, c = 3;
//
//        if (a > b && a > c) {
//
//            System.out.println("a is greatest");
//
//        } else if (b > c && b > a) {
//
//            System.out.println("b is greatest");
//
//        } else {
//            System.out.println("c is greatest");
//
//        }



//    public void playWithOperators() {
//        int a=12;
//        int b=13;
//
////        int i = b + b--;
//        int inc=--a + b-- + a-- + --b + b++ + a++ + ++b + b--;
//        System.out.println(inc);
//    }


