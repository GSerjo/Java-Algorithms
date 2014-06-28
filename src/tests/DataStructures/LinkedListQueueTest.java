package DataStructures;

import com.company.DataStructures.LinkedListQueue;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListQueueTest
{
    @Test
    public void isEmpty_newQueue_true()
    {
        LinkedListQueue queue = new LinkedListQueue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void enqueue_newQueue_correctOrder()
    {
        LinkedListQueue<Integer> queue = new LinkedListQueue<Integer>();
        queue.enqueue(0);
        queue.enqueue(1);
        assertEquals(2, queue.size());
        assertEquals(new Integer(0), queue.dequeue());
        assertEquals(new Integer(1), queue.dequeue());
        assertEquals(0, queue.size());
    }
}
