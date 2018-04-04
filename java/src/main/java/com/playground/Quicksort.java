package com.playground;


public class Quicksort {
  
  public int[] sort(int[] input) {
    return quicksort(input, 0, input.length - 1);
  }
  
  private int[] quicksort(int[] input, int min, int max) {
    
    if (min < max) {
      int pivotCentre = balanceArray(input, min, max);
      quicksort(input, pivotCentre + 1, max); // sort first half (< pivot)
      quicksort(input, min, pivotCentre - 1); // sort second half (> pivot)
    }
    
    return input;
  }
  
  /**
   *
   * Shamelessly copied "influenced" from https://www.geeksforgeeks.org/quick-sort/
   *
   *
   * @param input unsorted input
   * @param min   start index position
   * @param max   end index position
   * @return the {@code int} value representing the middle pivot position in a balanced array
   */
  private int balanceArray(int[] input, int min, int max) {
    
    int pivotIndex = max;
    int pivot = input[max];
    
    while (min < max) {
      
      // from the start, find the first bigger than pivot value
      while (min < max && input[min] < pivot) {
        min++;
      }
      
      // from the end, find the first smaller than pivot value
      while (min < max && input[max] >= pivot) {
        max--;
      }
      
      swap(input, min, max);
    }
    
    // put pivot in the centre
    swap(input, min, pivotIndex);
    
    return min;
  }
  
  private void swap(int[] input, int firstIndex, int secondIndex) {
    int temp = input[firstIndex];
    input[firstIndex] = input[secondIndex];
    input[secondIndex] = temp;
  }
  
}
