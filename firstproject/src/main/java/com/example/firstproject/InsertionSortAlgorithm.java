package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component
public class InsertionSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers)
    {
        //Logic for Insertion Sort
        int n = numbers.length;
        for (int j = 1; j < n; j++) {
            int key = numbers[j];
            int i = j-1;
            while ( (i > -1) && ( numbers[i] > key ) ) {
                numbers[i+1] = numbers[i];
                i--;
            }
            numbers[i+1] = key;
        }
        return numbers;
    }
}
