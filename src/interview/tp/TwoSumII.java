package interview.tp;

import java.util.Arrays;

public class TwoSumII {

  public static void main(String[] args) {
    int[] temp = new int[]{2,3,4};
    int target = 6;
    int[] result = twoSum(temp, target);
    Arrays.stream(result).forEach(System.out::println);
  }

  public static int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (right > left) {
      int result = numbers[left] + numbers[right];
      if (target > result) {
        left++;
      } else if(target < result){
        right--;
      }
      else{
        return new int[]{left + 1, right + 1};
      }
    }
    return new int[]{-1, -1};
  }
}
