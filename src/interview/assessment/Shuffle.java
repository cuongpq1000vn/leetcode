package interview.assessment;

import java.util.Arrays;

public class Shuffle {

  public static void main(String[] args) {
    int[] input = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
    int[] result = shuffle(input, 4);
    Arrays.stream(result).forEach(System.out::println);
  }

  public static int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
    int index = 0;
    while (index < n) {
      result[index * 2] = nums[index];
      result[index * 2 + 1] = nums[index + nums.length / 2];
      index++;
    }
    return result;
  }
}
