import java.util.Locale;

public class CheckVowels {

    static void vowels(String str) {
        String s = str.toLowerCase();
        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u') {
                System.out.print(ch[i]+",");
            count++;
        }

        }
        System.out.println();

        System.out.println("number of vowels in a string: " + count);

    }

    public static void main(String[] args) {
        CheckVowels cv= new CheckVowels();
        String str="priyab";
        cv.vowels(str);
    }
}
