package main

/*
	Selection Sort
	==============

	Time Complexity: O(n^2)
	Unstable
	In-place
*/

import "fmt"

func printArray(arr []int) {
	for _, val := range arr {
		fmt.Print(val, " ")
	}
	fmt.Println()
}

func sort(arr []int) {
	var min int
	for i := 0; i < len(arr); i++ {
		min = i
		for j := i + 1; j < len(arr); j++ {
			if arr[j] < arr[min] {
				min = j
			}
		}
		arr[i], arr[min] = arr[min], arr[i]
		printArray(arr)
	}
}

func main() {
	arr := []int{19, 10, 4, 3, 8, 5, 1}

	fmt.Println("Before Sorting:")
	printArray(arr)

	sort(arr)

	fmt.Println("\nAfter Sorting:")
	printArray(arr)
}
