package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssessmentTest {

    Assessment assessment = new Assessment();

    @Test
    public void find_indexes_with_nested_for_loops_Test(){
        // Given
        Integer[] nums = {2, 7, 11, 15};
        Integer target = 9;
        Integer[] expected = {0, 1};
        Integer[] expected2 = {1, 0};
        // When
        Integer[] actual = assessment.findIndexesWithNestedForLoops(nums, target);
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void find_indexes_with_nested_for_loops_Test2(){
        // Given
        Integer[] nums = {1, 2, 3, 4};
        Integer target = 6;
        Integer[] expected = {1, 3};
        Integer[] expected2 = {3, 1};
        // When
        Integer[] actual = assessment.findIndexesWithNestedForLoops(nums, target);
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void find_indexes_with_nested_for_loops_from_unsorted_array_Test(){
        // Given
        Integer[] nums = {2, 1, 4, 3};
        Integer target = 6;
        Integer[] expected = {0, 2};
        Integer[] expected2 = {2, 0};
        // When
        Integer[] actual = assessment.findIndexesWithNestedForLoops(nums, target);
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void longer_array_with_nested_for_loops(){
        // Given
        Integer[] nums = {2, 1, 13, 16, 18, 19, 20, 21, 23, 24, 25, 26, 57, 28, 29, 30, 4, 3, 8, 17, 32, 9, 15, 99, 5, 46, 12, 66, 77, 88, 55, 44, 33, 22, 11, 98, 97, 14};
        Integer target = 155;
        Integer[] expected = {12, 35};
        Integer[] expected2 = {35, 12};
        // When
        Integer[] actual = assessment.findIndexesWithNestedForLoops(nums, target);
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void find_indexes_with_Hashtable_test(){
        // Given
        Integer[] nums = {2, 1, 4, 3};
        Integer target = 6;
        Integer[] expected = {0, 2};
        Integer[] expected2 = {2, 0};
        // When
        Integer[] actual = assessment.findIndexesWithHashTable(nums, target);
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void longer_array_with_Hashtable(){
        // Given
        Integer[] nums = {2, 1, 13, 16, 18, 19, 20, 21, 23, 24, 25, 26, 57, 28, 29, 30, 4, 3, 8, 17, 32, 9, 15, 99, 5, 46, 12, 66, 77, 88, 55, 44, 33, 22, 11, 98, 97, 14};
        Integer target = 155;
        Integer[] expected = {12, 35};
        Integer[] expected2 = {35, 12};
        // When
        Integer[] actual = assessment.findIndexesWithHashTable(nums, target);
        // Then
        assertArrayEquals(expected, actual);
    }

}
