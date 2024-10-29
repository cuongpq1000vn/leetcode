package interview.tp;


public class Palindrome {

  public static void main(String[] args) {
    String input = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(input));
    System.out.println(isPalindromePerformance(input));
  }

  public static boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    char[] charSet = s.toCharArray();
    int left = 0;
    int right = charSet.length - 1;
    while (left < right) {
      if (charSet[left] != charSet[right]) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static boolean isPalindromePerformance(String s) {
    s = s.toLowerCase();
    char[] charSet = s.toCharArray();
    int left = 0;
    int right = charSet.length - 1;
    while (left < right) {
      if (!Character.isLetterOrDigit(charSet[left])) {
        left++;
      } else if (!Character.isLetterOrDigit(charSet[right])) {
        right--;
      } else {
        if (charSet[left] != charSet[right]) {
          return false;
        }
        left++;
        right--;
      }
    }
    return true;
  }
}
