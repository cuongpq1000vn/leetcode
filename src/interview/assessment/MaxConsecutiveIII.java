package interview.assessment;

public class MaxConsecutiveIII {

  public static void main(String[] args) {
    int[] intput = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
    System.out.println(longestOnes(intput, 2));
  }

  public static int longestOnes(int[] nums, int k) {
    int left = 0;
    int right = 0;
    int max = 0;
    int windowSize = 0;
    while(nums.length > right) {
      if(nums[right] == 0){
        windowSize++;
        while(windowSize > k){
          int temp = nums[left + 1];
          if(temp == 0){
            windowSize--;
          }
        }
      }
      max = Math.max(max, right - left + 1);
      right++;
    }
    return max;
  }
}
