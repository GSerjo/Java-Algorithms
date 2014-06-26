package com.company.DataStructures;

public class StackOfStrings
{
    private  Node root;
    private int count;

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void Push(String value)
    {
        Node old = root;
        root = new Node();
        root.value = value;
        root.next = old;
        count++;
    }

    public String Pop()
    {
        String result = root.value;
        root = root.next;
        count--;
        return result;
    }

    private class Node
    {
        String value;
        Node next;
    }
}
