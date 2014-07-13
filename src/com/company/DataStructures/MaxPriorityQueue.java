package com.company.DataStructures;

public final class MaxPriorityQueue<Key extends Comparable<Key>> {

    private Key[] queue;
    private int count;

    public MaxPriorityQueue(int capacity){
        queue = (Key[])new Comparable[capacity + 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int count(){
        return count;
    }

    public void enqueue(Key value){
        queue[++count] = value;
        swim(count);
    }

    public Key dequeue(){
        Key result = queue[1];
        exchange(1, count--);
        queue[count+1] = null;
        sink(1);
        return result;
    }

    private void sink(int k){
        while(2*k <= count){
            int i = 2*k;
            if(i < count && less(i, i+1)){
                i++;
            }
            if(!less(k, i)){
                break;
            }
            exchange(k, i);
            k = i;
        }
    }

    private void swim(int k){
        while(k > 1 && less(k/2, k)){
            exchange(k/2, k);
            k = k/2;
        }
    }

    private boolean less(int i, int j){
        return queue[i].compareTo(queue[j]) < 0;
    }

    private void exchange(int i, int j){
        Key dummy = queue[i];
        queue[i] = queue[j];
        queue[j] = dummy;
    }
}
