package main

import (
	"fmt"
)

func quicksort(arr []int) []int {

	arrLen := len(arr)
	if arrLen < 1 {
		return arr
	}

	last := arrLen - 1
	pivot, left, right := arr[last], make([]int, 0), make([]int, 0)
	arr = arr[:last] // pop

	for _, item := range arr {
		if item <= pivot {
			left = append(left, item)
		} else {
			right = append(right, item)
		}
	}

	return append(append(quicksort(left), pivot), quicksort(right)...)
}

func main() {
	arr := []int{6, 4, 5, 7, 3, 9, 10, 2, 8, 1, 1}
	fmt.Println(quicksort(arr))
}
