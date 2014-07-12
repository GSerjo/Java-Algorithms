package com.company.Sorting;

public class Insertion {
    public static void sort(Comparable[] list){
        for(int i = 1; i < list.length; i++){
            for(int j = i; j > 0; j--){
                if(less(list[j], list[j - 1])){
                    exchange(list, j, j - 1);
                }
            }
        }
    }

    public static boolean isSorted(Comparable[] list){
        for(int i = 1; i < list.length; i++){
            if(less(list[i], list[i - 1])){
                return false;
            }
        }
        return true;
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] list, int i, int j){
        Comparable dummy = list[i];
        list[i] = list[j];
        list[j] = dummy;
    }
}
