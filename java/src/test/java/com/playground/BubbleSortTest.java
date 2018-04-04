package com.playground;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

  @Test
  public void test() {

    int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    int[] result = BubbleSort.sort(arr);

    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(result));
  }
}
