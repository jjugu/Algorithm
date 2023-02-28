import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> vowel = Arrays.asList("a", "e", "i", "o", "u");
        for (int i = 0; i < my_string.length(); i++) {
            if (!vowel.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}