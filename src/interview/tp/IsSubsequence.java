package interview.tp;

public class IsSubsequence {
  public static void main(String[] args){
    String input = "abc";
    String pattern = "acb";
    System.out.println(isSubsequence(input, pattern));
  }

  public static boolean isSubsequence(String s, String t) {
    int sIndex = 0;
    int tIndex= 0;
    while(sIndex < s.length() && tIndex < t.length()){
      if(s.charAt(sIndex) == t.charAt(tIndex)){
        sIndex++;
      }
      tIndex++;
    }
    return sIndex == s.length();
  }
}
