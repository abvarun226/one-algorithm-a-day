package main

import "fmt"

/*
	Bubble Sort
	===========
	Time Complexity: O(n^2)
	Stable
	In-place
*/

func printArray(arr []int) {
	for _, val := range arr {
		fmt.Print(val, " ")
	}
	fmt.Println()
}

func sort(arr []int) {
	for i := 0; i < len(arr); i++ {
		for j := 1; j < len(arr); j++ {
			if arr[j] < arr[j-1] {
				arr[j], arr[j-1] = arr[j-1], arr[j]
				printArray(arr)
			}
		}
	}
}

func main() {
	arr := []int{8, 10, 4, 2, 100, 120, 35, 350, 22, 1, 10}

	fmt.Println("Before Sorting:")
	printArray(arr)

	fmt.Println("\nDuring Sorting:")
	sort(arr)

	fmt.Println("\nAfter Sorting:")
	printArray(arr)
}
