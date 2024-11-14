package interview.assessment;

public class MaxVowels {

  public static void main(String[] args) {
    String input = "leetcode";
    System.out.println(maxVowels(input, 3));
  }

  public static int maxVowels(String s, int k) {
    StringBuilder firstSubstring = new StringBuilder();
    for(int i = 0; i < k; i++){
      if(isVowelPerformance(s.charAt(i))){
        firstSubstring.append(s.charAt(i));
      }
    }
    String firstTemp = firstSubstring.toString();
    int current = firstTemp.length();
    int maxVowels = firstTemp.length();
    for(int i = k; i < s.length(); i++){
      int left = i - k;
      if(isVowelPerformance(s.charAt(left))){
        current--;
      }
      if(isVowelPerformance(s.charAt(i))){
        current++;
      }
      maxVowels = Math.max(maxVowels, current);
    }

    return maxVowels;
  }

  public static boolean isVowelPerformance(char y) {
    return y == 'a' || y == 'e' || y == 'i' || y == 'o'
        || y == 'u' || y == 'A' || y == 'E' || y == 'I'
        || y == 'O' || y == 'U';
  }
}
