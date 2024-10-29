package interview.tp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class NumberOccurrences {

  public static void main(String[] args) {
    int[] input = new int[]{1, 2, 3, 2, 4, 1, 5, 2};
    searchOccurence(input);
    optimizeOccurence(input);
  }

  public static int[] searchOccurence(int[] nums) {
    HashMap<Integer, Integer> numberOccurences = new HashMap<>();
    for (int num : nums) {
      if (numberOccurences.containsKey(num)) {
        numberOccurences.put(num, numberOccurences.get(num) + 1);
      } else {
        numberOccurences.put(num, 1);
      }
    }
    numberOccurences.entrySet().removeIf(e -> e.getValue() < 2);

    ArrayList<Integer> result = new ArrayList<>();
    numberOccurences.forEach((key, value) -> result.add(key));
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] optimizeOccurence(int[] nums) {
    HashMap<Integer, Integer> numberOccurences = new HashMap<>();
    HashSet<Integer> resultSet = new HashSet<>();

    for(int element : nums){
      numberOccurences.put(element, numberOccurences.getOrDefault(element, 0));
      if (numberOccurences.get(element) == 2){
        resultSet.add(element);
      }
    }
    return resultSet.stream().mapToInt(Integer::intValue).toArray();
  }
}