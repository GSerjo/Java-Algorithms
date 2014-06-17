package com.company;

public class QuickFindUF implements IUnionFind {
    private int[] id;
    private int count;

    public QuickFindUF(int number)
    {
        count = number;
        id = new int[number];
        for(int i = 0; i < id.length; i++)
        {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q)
    {
        return find(p) == find(q);
    }

    private int find(int p)
    {
        return id[p];
    }

    public int count()
    {
        return count;
    }

    public void union(int p, int q)
    {
        int idP = find(p);
        int idQ = find(q);
        if(idP == idQ)
        {
            return;
        }
        for(int i = 0; i < id.length; i++)
        {
            if(id[i] == idP)
            {
                id[i] = idQ;
            }
        }
        count--;
    }
}
