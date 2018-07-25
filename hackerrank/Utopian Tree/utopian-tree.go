package main

import "fmt"

func main() {
	var t int
	fmt.Scanf(&t)
	cycles := make([]int, t)
	for i := 0; i < t; i++ {
		fmt.Scanf(&cycles[i])
	}
	for i := 0; i < t; i++ {
		result := 1
		for j := 0; j < cycles[i]; j++ {
			if (j + 2) % 2 == 0 {
				result = result * 2
			} else {
				result++
			}
		}
		fmt.Println(result)
	}
}