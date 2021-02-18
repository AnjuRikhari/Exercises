package com.company;

import java.util.*;

public class Ques6 {
    public static void sortByFreq(int[] arr){
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());
        Comparator<Map.Entry<Integer, Integer>> comp = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Original Array : "+Arrays.toString(arr));
        System.out.println("Sorted Array : ");
        System.out.print("[");
        for (Map.Entry<Integer,Integer> entry : list)
        {
            int freq = entry.getValue();
            while(freq >= 1)
            {
                System.out.print(entry.getKey()+" ");
                freq--;
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        // Print the elements of an array in the decreasing frequency if
        // 2 numbers have same frequency then print the one which came first.
        int[] a = new int[]{4,4,5,6,4,2,2,8,5};
        sortByFreq(a);
    }
}
