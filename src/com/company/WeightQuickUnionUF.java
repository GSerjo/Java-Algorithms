package com.company;

public class WeightQuickUnionUF implements IUnionFind
{
    int[] id;
    int[] sz;
    private int count;

    public WeightQuickUnionUF(int count)
    {
        this.count = count;
        id = new int[count];
        sz = new int[count];
        for (int i = 0; i < count; i++)
        {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int find(int i)
    {
        while(i != id[i])
        {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q)
    {
        return find(p) == find(q);
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
        if(sz[idP] > sz[idQ])
        {
            id[idQ] = idP;
            sz[idP] += sz[idQ];
        }
        else
        {
            id[idP] = idQ;
            sz[idQ] += sz[idP];
        }
        count--;
    }
}
