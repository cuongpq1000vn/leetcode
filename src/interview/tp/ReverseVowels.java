package interview.tp;

public class ReverseVowels {

  public static void main(String[] args) {
    String input = "IceCreAm";
    System.out.println(reverseVowels(input));
  }

  public static String reverseVowels(String s) {
    char[] charGroup = s.toCharArray();
    int left = 0;
    int right = charGroup.length - 1;
    while (left < right) {
      if (isVowels(charGroup[left]) && isVowels(charGroup[right])) {
        char temp = charGroup[left];
        charGroup[left] = charGroup[right];
        charGroup[right] = temp;
        right--;
        left++;
      } else if (!isVowels(charGroup[left])) {
        left++;
      } else {
        right--;
      }

    }
    return String.valueOf(charGroup);
  }

  public static boolean isVowels(char s) {
    return "AEIOUaeiou".indexOf(s) != -1;
  }

  public static boolean isVowelPerformance(char y) {
    return y == 'a' || y == 'e' || y == 'i' || y == 'o'
        || y == 'u' || y == 'A' || y == 'E' || y == 'I'
        || y == 'O' || y == 'U';
  }
}
