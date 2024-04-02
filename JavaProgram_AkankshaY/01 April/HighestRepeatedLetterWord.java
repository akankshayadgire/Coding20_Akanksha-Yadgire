import java.util.HashMap;
import java.util.Map;

class HighestRepeatedLetterWord
{
    public static void main(String[] args) 
    {
        String input1 = "abcdefghij google microsoft";
        String input2 = "cameron blue";
        
        System.out.println(findWordWithHighestRepeatedLetter(input1));
        System.out.println(findWordWithHighestRepeatedLetter(input2));
    }

    public static String findWordWithHighestRepeatedLetter(String input) 
    {
        String[] words = input.split(" ");
        String result = "";
        int maxCount = 0;

        for (String word : words) {
            Map<Character, Integer> letterCount = new HashMap<>();

            for (char c : word.toCharArray()) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }

            int maxRepeated = letterCount.values().stream().mapToInt(Integer::intValue).max().orElse(0);

            if (maxRepeated > maxCount) {
                result = word;
                maxCount = maxRepeated;
            }
        }

        return maxCount > 1 ? result : "-1";
    }
}
