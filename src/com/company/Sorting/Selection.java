package com.company.Sorting;

public class Selection {
    public static void sort(Comparable[] list){
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if(less(list[j], list[min])){
                    min = j;
                }
            }
            exchange(list, i, min);
        }
    }

    private static void exchange(Comparable[] list, int i, int j){
        Comparable dummy = list[i];
        list[i] = list[j];
        list[j] = dummy;
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
}