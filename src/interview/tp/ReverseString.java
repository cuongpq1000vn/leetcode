package interview.tp;

public class ReverseString {

  public static void main(String[] args) {
    char[] s = new char[]{'h','e','l','l','o'};
    reverseString(s);
    System.out.println(s);
  }

  public static void reverseString(char[] s) {
    int left = 0;
    int right = s.length - 1;
    while(left < right){
      char temp = s[right];
      s[right] = s[left];
      s[left] = temp;
      right--;
      left++;
    }
  }
}
