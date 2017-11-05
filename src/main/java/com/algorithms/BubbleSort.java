package com.algorithms;

public class BubbleSort {


  public static int[] sort(int[] arr) {

    boolean swaps = false;

    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = temp;
        swaps = true;
      }
    }

    return !swaps ? arr : sort(arr);
  }
}
