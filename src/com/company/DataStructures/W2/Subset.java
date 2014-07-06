package com.company.DataStructures.W2;
import com.company.*;
import com.company.DataStructures.RandomizedQueue;

public class Subset {
    public static void main(String[] args){

        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        int value = Integer.valueOf(args[0]);

        while (!StdIn.isEmpty()) {

            String item = StdIn.readString();
            queue.enqueue(item);
        }
        while (value > 0){
            StdOut.println(queue.dequeue());
            value--;
        }
    }
}
