package com.playground;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class QuicksortTest {
  
  private Quicksort quicksort;
  
  @Before
  public void setup() {
    this.quicksort = new Quicksort();
  }
  
  @Test
  public void sort() {
    
    int[] input = new int[]{4, 2, 6, 3, 1, 7, 5};
    
    assertThat( quicksort.sort(input), is(new int[]{1, 2, 3, 4, 5, 6, 7}));
  }
  
  @Test
  public void sortIncludingZero() {
    
    int[] input = new int[]{7, 3, 4, 8, 1, 0, 10, 9, 5, 2, 6};
    
    int[] result = quicksort.sort(input);
    
    assertThat(result, is(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }
  
  @Test
  public void sortWithDuplicates() {
    
    int[] input = new int[]{4, 2, 6, 6, 7, 1, 3, 5};
    
    assertThat(quicksort.sort(input), is(new int[]{ 1, 2, 3, 4, 5, 6, 6, 7}));
  }
}
