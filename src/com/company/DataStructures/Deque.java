package com.company.DataStructures;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item>
{
    private Node first, last;
    private int count;

    private class Node
    {
        Item value;
        Node next;
        Node previous;
    }

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return first == null && last == null;
    }

    public void addFirst(Item item)
    {
        if(item == null)
        {
            throw new java.lang.NullPointerException();
        }
        Node old = first;
        first = new Node();
        first.value = item;
        first.next = old;
        if(last == null)
        {
            last = first;
        }
        else
        {
            old.previous = first;
        }
        count++;
    }

    public void addLast(Item item)
    {
        if(item == null)
        {
            throw new NullPointerException();
        }
        Node old = last;
        last = new Node();
        last.value = item;
        last.previous = old;
        if(first == null)
        {
            first = last;
        }
        else
        {
            old.next = last;
        }
        count++;
    }

    public Item removeFirst()
    {
        if(isEmpty())
        {
            throw new java.util.NoSuchElementException();
        }
        Item result = first.value;
        first = first.next;
        if(first == null)
        {
            last = null;
        }
        else
        {
            first.previous = null;
        }
        count--;
        return result;
    }

    public Item removeLast()
    {
        if(isEmpty())
        {
            throw new java.util.NoSuchElementException();
        }
        Item result = last.value;
        last = last.previous;
        if(last == null)
        {
            first = null;
        }
        else
        {
            last.next = null;
        }
        count--;
        return result;
    }

    public java.util.Iterator iterator()
    {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item>
    {
        private Node current = first;

        public void remove()
        {
            throw new java.lang.UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return current != null;
        }

        public Item next()
        {
            if(!hasNext())
            {
                throw new java.util.NoSuchElementException();
            }
            Item result = current.value;
            current = current.next;
            return result;
        }
    }
}
