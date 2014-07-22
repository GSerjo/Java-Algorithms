package com.company.Sorting;

public class HeapSort
{
    public static void sort(Comparable[] list){
        Comparable[] result = new Comparable[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            result[i + 1] = list[i];
        }
        int count = list.length;
        for(int i = count/2; i >= 1; i-- ){
            sink(i, count ,  result);
        }
        while(count > 1){
            exchange(1, count--, result);
            sink(1, count,  result);
        }
        for (int i = 1; i < result.length ; i++) {
            list[i - 1] = result[i];
        }
    }

    public static boolean isSorted(Comparable[] list){
        for (int i = 1; i < list.length; i++) {
            if(less(i, i - 1, list)){
                return false;
            }
        }
        return true;
    }

    private static void sink(int k, int count, Comparable[] list){
        while(2*k <= count ){
            int i = 2*k;
            if(i < count && less(i, i + 1, list)){
                i++;
            }
            if(!less(k, i, list)){
                break;
            }
            exchange(k, i, list);
            k = i;
        }
    }

    private static boolean less(int i, int j, Comparable[] list){
        return list[i].compareTo(list[j]) < 0;
    }

    private static void exchange(int i, int count, Comparable[] list){
        Comparable dummy = list[i];
        list[i] = list[count];
        list[count] = dummy;
    }

}
