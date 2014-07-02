package DataStructures;

import com.company.DataStructures.RandomizedQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public final class RandomizedQueueTest
{
    @Test
    public void isEmpty_newQueue_true()
    {
        RandomizedQueue queue = new RandomizedQueue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void enqueue_newQueue_sizeIncreased()
    {
        RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
        queue.enqueue(0);
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());
    }

    @Test
    public void dequeue_newQueue_sizeDecreased()
    {
        RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.dequeue();
        assertEquals(1, queue.size());
    }

    @Test(expected = NullPointerException.class)
    public void enqueue_nullItem_exceptionThrown()
    {
        RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
        queue.enqueue(null);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void dequeue_emptyQueue_exceptionThrown()
    {
        RandomizedQueue<Integer> queue = new RandomizedQueue<Integer>();
        queue.dequeue();
    }

}
