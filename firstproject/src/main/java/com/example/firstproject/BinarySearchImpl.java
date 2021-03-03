package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;
    public BinarySearchImpl(SortAlgorithm sortAlgorithm)
    {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
    public int binarySearch(int[] numbers, int numberToSearchFor)
    {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Logic of Searching the array
        int size = numbers.length;
        int low = 0,high = size-1,mid = 0,r=0;

        mid = low + high/2;
        while(low<=high){
            if(numbers[mid] == numberToSearchFor){
                r = 1;
                break;
            }
            else if(numbers[mid]<numberToSearchFor)
                low = mid+1;
            else
                high = mid - 1;
            mid = (low+high)/2;
        }
        return r;
    }
}
