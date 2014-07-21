package com.company.Sorting;

public class HeapSort
{
    public static void sort(Comparable[] list){
        int count = list.length;
        for(int i = count/2; i > 0; i-- ){
            sink(i, count,  list);
        }
        while(count > 1){
            exchange(1, count--, list);
            sink(1, count,  list);
        }
    }

    private static void sink(int k, int count, Comparable[] list){
        while(2*k <= count){
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

    private static void exchange(int i, int j, Comparable[] list){
        Comparable dummy = list[i];
        list[i] = list[j];
        list[j] = dummy;
    }

}
