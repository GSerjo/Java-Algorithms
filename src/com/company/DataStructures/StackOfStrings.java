package com.company.DataStructures;

public class StackOfStrings
{
    private  Node root;

    public boolean isEmpty()
    {
        return root == null;
    }

    public void Push(String value)
    {
        Node previous = root;
        root = new Node();
        root.value = value;
        root.next = previous;
    }

    public String Pop()
    {
        String result = root.value;
        root = root.next;
        return result;
    }

    private class Node
    {
        String value;
        Node next;
    }
}
