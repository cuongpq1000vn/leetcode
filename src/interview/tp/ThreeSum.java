package interview.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

  public static void main(String[] args) {
    int[] number = new int[]{-2, 0, 1, 1, 2};
    List<List<Integer>> result = threeSum(number);
    List<List<Integer>> betterResult = threeSumPerformance(number);
    System.out.println(result);
    System.out.println(betterResult);
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> groupThree = new HashSet<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      int target = -nums[i];
      while (right > left) {
        int result = nums[left] + nums[right];
        if (target > result) {
          left++;
        } else if (target < result) {
          right--;
        } else {
          List<Integer> duplicate = Arrays.asList(nums[i], nums[left], nums[right]);
          groupThree.add(duplicate);
          left++;
          right--;
        }
      }
    }
    return groupThree.stream().toList();
  }

  public static List<List<Integer>> threeSumPerformance(int[] nums) {
    List<List<Integer>> groupThree = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue; // Skip duplicates for the first number
      }
      int left = i + 1;
      int right = nums.length - 1;
      int target = -nums[i];
      while (right > left) {
        int result = nums[left] + nums[right];
        if (target > result) {
          left++;
        } else if (target < result) {
          right--;
        } else {
          groupThree.add(Arrays.asList(nums[i], nums[left], nums[right]));
          while (left < right && nums[left] == nums[left + 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right - 1]) {
            right--;
          }
          left++;
          right--;
        }
      }

    }
    return groupThree;
  }

}
