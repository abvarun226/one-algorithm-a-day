package main

import (
	"fmt"
	"os"
	"strconv"
)

func fibonacci(n int) {
	a := 0
	b := 1
	for i := 0; i < n; i++ {
		fmt.Print(a, " ")
		a, b = b, a+b
	}
	fmt.Println()
}

func main() {
	n, err := strconv.Atoi(os.Args[1])
	if err != nil {
		panic(err)
	}
	fmt.Println("Printing first ", n, " Fibonacci numbers:")
	fibonacci(n)
}
