package com.company.DataStructures;

public final class LinkedListQueue<TItem>
{
    private Node first, last;
    private int count;

    private class Node
    {
        TItem value;
        Node next;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public int size()
    {
        return count;
    }

    public void enqueue(TItem value)
    {
        Node old = last;
        last = new Node();
        last.value = value;
        if(isEmpty())
        {
            first = last;
        }
        else
        {
            old.next = last;
        }
        count++;
    }

    public TItem dequeue()
    {
        if(isEmpty())
        {
            throw new java.util.NoSuchElementException();
        }
        TItem result = first.value;
        first = first.next;
        if(isEmpty())
        {
            last = null;
        }
        count--;
        return result;
    }
}
