package main

/*
	Pattern Matching
	================

	Time Complexity: O(nm) where,
		n -> length of text string
		m -> length of pattern string
*/

import "fmt"

func findMatch(text string, pattern string) int {
	length := len(pattern)
	for idx, _ := range text {
		if (idx + length) > len(text) {
			return -1
		}
		if pattern == text[idx:idx+length] {
			return idx
		}
	}
	return -1
}

func main() {
	text := "Hello varun. Welcome to Algorithms course!"
	pattern := "course!"

	if pos := findMatch(text, pattern); pos == -1 {
		fmt.Printf("Pattern \"%s\" not found in text!\n", pattern)
	} else {
		fmt.Printf("Pattern \"%s\" found in text at position %d\n", pattern, pos)
	}
}
