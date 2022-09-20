import java.util.HashMap;
import java.util.Map;

public class CharCountOccurencesOfString {
    public static void main(String[] args) {
        CharCountOccurencesOfString charCount =new CharCountOccurencesOfString();
        charCount.getOccurence("Priyanka");

    }

    public void getOccurence(String inputString) {
        HashMap<Character,Integer> charCountMap = new HashMap<>();

        char[] chars=inputString.toCharArray();

        for(char c:chars) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c,1);
            }
        }
        for (Map.Entry entry: charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }


}
