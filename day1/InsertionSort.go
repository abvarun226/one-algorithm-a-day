package main

/*
	Insertion sort
	==============

	Time Complexity: O(n^2)
	Stable - Maintains relative order of the same elements
	In-place - Requires constant amount of additional space
*/

import "fmt"

func sort(arr []int) {
	for i := 1; i < len(arr); i++ {
		j := i
		for j > 0 && arr[j] < arr[j-1] {
			arr[j], arr[j-1] = arr[j-1], arr[j]
			j--
		}
	}
}

func main() {
	arr := []int{2, 5, 1, 100, 10, 4, 21, 54}

	fmt.Println("Before Sorting:")
	for _, x := range arr {
		fmt.Print(x, " ")
	}
	fmt.Println()

	sort(arr)

	fmt.Println("\nAfter Sorting:")
	for _, x := range arr {
		fmt.Print(x, " ")
	}
	fmt.Println()
}
