package main

/*
	Time Complexity: O(n)
*/

import "fmt"

func search(arr []int, key int) int {
	for idx, val := range arr {
		if val == key {
			return idx
		}
	}
	return -1
}

func main() {
	arr := []int{1, 8, 4, 5, 100, 123, 564, 32, 10}
	// key := 6
	key := 32

	if search(arr, key) == -1 {
		fmt.Println("Key not found!")
	} else {
		fmt.Println("Key found in array")
	}
}
