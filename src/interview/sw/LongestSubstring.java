package interview.sw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

  public static void main(String[] args) {
    String input = "abcabcbb";
    System.out.println(optimizeLongestString(input));
  }

  public static int lengthOfLongestSubstring(String s) {
    int start = 0;
    int end = 0;
    int maximumLength = 0;
    Map<Character, Integer> trackWindow = new HashMap<>();
    while (end < s.length()) {
      if(trackWindow.containsKey(s.charAt(end))){
        trackWindow.put(s.charAt(end), trackWindow.get(s.charAt(end)) + 1);
      }
      else{
        trackWindow.put(s.charAt(end), 1);
      }

      int windowSize = end - start + 1;

      if (trackWindow.size() == windowSize) {
        maximumLength = Math.max(maximumLength, windowSize);
        end++;
      } else {
        while (trackWindow.size() < windowSize) {
          trackWindow.put(s.charAt(start), trackWindow.get(s.charAt(start)) - 1);
          if(trackWindow.get(s.charAt(start)) == 0){
            trackWindow.remove(s.charAt(start));
          }
          start++;
          windowSize = end - start + 1;
        }
        if (trackWindow.size() == windowSize) {
          maximumLength = Math.max(maximumLength, windowSize);
        }
        end++;
      }
    }

    return maximumLength;
  }

  public static int optimizeLongestString(String s){
    int start = 0;
    int end = 0;
    int maximumLength = 0;
    Set<Character> characterGroup = new HashSet<>();
    while(end < s.length()){
      int windowSize = end - start + 1;
      if(!characterGroup.contains(s.charAt(end))){
        characterGroup.add(s.charAt(end));
        maximumLength = Math.max(maximumLength, windowSize);
      }
      else{
        System.out.println(characterGroup);
        while (characterGroup.contains(s.charAt(end))) {
          characterGroup.remove(s.charAt(start));
          start++;
        }
        characterGroup.add(s.charAt(end));
      }
      end++;
    }
    return maximumLength;
  }
}
