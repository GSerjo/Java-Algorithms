package com.company.DataStructures;

import com.company.StdRandom;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item>
{

    private Item[] data;

    public RandomizedQueue()
    {
        data = (Item[])new Object[1];
    }

    private int count;

    public boolean isEmpty()
    {
        return count == 0;
    }

    public int size()
    {
        return count;
    }

    public void enqueue(Item item)
    {
        if(item == null)
        {
            throw new java.lang.NullPointerException();
        }
        if(count > 0 && count == data.length)
        {
            resize(data.length*2);
        }
        data[count++] = item;
    }

    public Item dequeue()
    {
        if(isEmpty())
        {
            throw new java.util.NoSuchElementException();
        }
        int index = StdRandom.uniform(count);
        Item result = data[index];
        if(index != count - 1)
        {
            data[index] = data[count - 1];
        }
        data[count - 1] = null;
        count--;
        if(count > 0 && count == data.length/4)
        {
            resize(data.length/2);
        }
        return result;
    }

    public Iterator iterator()
    {
        return new QueueIterator();
    }

    private void resize(int length)
    {
        Item[] dummy = (Item[])new Object[length];
        for (int i = 0; i < data.length; i++)
        {
            dummy[i] = data[i];
        }
        data = dummy;
    }

    private class QueueIterator implements Iterator<Item>
    {
        private int length = count;
        private Item[] items;

        public QueueIterator()
        {
            items = (Item[])new Object[data.length];
            for (int i = 0; i < data.length; i++)
            {
                items[i] = data[i];
            }
        }

        public void remove()
        {
            throw new java.lang.UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return length != 0;
        }

        public Item next()
        {
            if(!hasNext())
            {
                throw new java.util.NoSuchElementException();
            }
            int index = StdRandom.uniform(length);
            Item result = items[index];
            if(index != length - 1)
            {
                items[index] = items[length - 1];
            }
            items[length - 1] = null;
            length--;
            return result;
        }
    }
}
