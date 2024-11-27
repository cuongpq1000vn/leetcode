package interview.microsoft;

import java.util.Arrays;

public class CyclicRotation {

  public static void main(String[] args) {
    int[] intput = new int[]{3, 8, 9, 7, 6};
    Arrays.stream(betterPerformance(intput,3)).forEach(System.out::println);
  }

  public static int[] solution(int[] A, int K) {
    if (A.length == 0) {
      return new int[]{};
    }
    int[] temp = A;
    for (int i = 0; i < K; i++) {
      temp = rotateArray(temp);
    }
    return temp;
  }

  public static int[] rotateArray(int[] A) {
    int[] result = new int[A.length];
    for (int i = 0; i < A.length - 1; i++) {
      result[i + 1] = A[i];
    }
    result[0] = A[A.length - 1];
    return result;
  }

  public static int[] betterPerformance(int[] A, int K){
    int[] rotate = new int[A.length];
    for(int i = 0; i < A.length; i++){
      int index = (i + K) % A.length;
      rotate[index] = A[i];
    }

    return rotate;
  }
}
