public class Details {
    public static void main(String[] args) {

        String detl = getDetails("Priyanka", "Biradar", "priyab650@gmail.com");
        System.out.println(detl);
    }


    public static String getDetails(String firstName, String lastName, String emailId) {

        String dtl = firstName + " " + lastName + " has an email with id " + emailId;
        return dtl;

    }
}

