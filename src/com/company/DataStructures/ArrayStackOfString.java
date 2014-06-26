package com.company.DataStructures;

public class ArrayStackOfString
{
    private String[] data;
    private int count;

    public ArrayStackOfString()
    {
        data = new String[1];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public void Push(String value)
    {
        if(count == data.length)
        {
            resize(count*2);
        }
        data[count++] = value;
    }

    public String Pop()
    {
        if(isEmpty())
        {
            throw new java.util.NoSuchElementException();
        }
        String result = data[--count];
        data[count] = null;
        if(count > 0 && count == data.length/4)
        {
            resize(data.length/2);
        }
        return result;
    }

    private void resize(int size)
    {
        String[] dummy = new String[size];
        for(int i = 0; i < data.length; i++)
        {
            dummy[i] = data[i];
        }
        data = dummy;
    }

}
