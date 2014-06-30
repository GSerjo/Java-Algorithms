package com.company.DataStructures;

public class Deque<Item>
{

    private Node first, last;
    private int count;

    private class Node
    {
        Item value;
        Node next;
    }

    public int size()
    {
        return count;
    }

    public void addFirst(Item item)
    {

    }
}
