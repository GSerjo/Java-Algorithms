package com.company.DataStructures;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable
{

    private int count;

    public boolean isEmpty()
    {
        return count == 0;
    }

    public int size()
    {
        return count;
    }

    public void Enqueue(Item item)
    {
        if(item == null)
        {
            throw new java.lang.NullPointerException();
        }
    }

    public Iterator iterator()
    {
        return null;
    }
}
