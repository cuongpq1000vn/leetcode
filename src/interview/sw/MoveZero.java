package interview.sw;

import java.util.Arrays;

public class MoveZero {
  public static void main(String[] args) {
    int[] input = new int[]{0,1,0,3,12};
    performanceMoveZero(input);
    Arrays.stream(input).forEach(System.out::println);
  }
  public static void moveZeroes(int[] nums) {
    int left = 0;
    int right = 0;
    if (nums.length > 2) {
      while (right < nums.length) {
        if (nums[left] == 0 && nums[right] == 0) {
          right++;
        } else if (nums[left] == 0 && nums[right] != 0) {
          swapIndex(nums, left, right);
          left++;
          right++;
        }
      }
    } else if (nums.length == 2) {
      if (nums[0] == 0 && nums[1] != 0) {
        swapIndex(nums, 0, 1);
      }
    }
  }

  public static void performanceMoveZero(int[] nums){
    int nonZeroIndex = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != 0){
        nums[nonZeroIndex] = nums[i];
        nonZeroIndex++;
      }
    }
    while(nonZeroIndex < nums.length){
      nums[nonZeroIndex] = 0;
      nonZeroIndex++;
    }
  }

  public static void swapIndex(int[] nums, int left, int right){
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
  }
}
