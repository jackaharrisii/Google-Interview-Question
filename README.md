# Google-Interview-Question

Given an array of ints and a target int, return the indexes of the two numbers in the array that add up to the target. You can assume that there is pair of numbers that satisfies the problem, and that the lower numbered index will be returned first in the output array.

A nested for loop solution with an array of 1000 ints takes ~11 ms to process a test.
A single for loop that compares against a hashmap takes ~3 ms to process a test against the same array.
