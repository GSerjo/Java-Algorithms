package DataStructures;

import com.company.DataStructures.MaxPriorityQueue;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxPriorityQueueTest {

    @Test
    public void isEmpty_newQueue_true(){
        MaxPriorityQueue queue = new MaxPriorityQueue(1);
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.count());
    }

    @Test
    public void enqueue_newQueue_sizeIncreased(){
        MaxPriorityQueue<Integer> queue = new MaxPriorityQueue<Integer>(1);
        queue.enqueue(0);
        assertEquals(1, queue.count());
    }

    @Test
    public void dequeue_newQueue_sizeDecreased(){
        MaxPriorityQueue<Integer> queue = new MaxPriorityQueue<Integer>(5);
        queue.enqueue(0);
        queue.enqueue(1);
        queue.dequeue();
        assertEquals(1, queue.count());
    }

    @Test
    public void dequeue_newQueue_maxValue(){
        MaxPriorityQueue<Integer> queue = new MaxPriorityQueue<Integer>(5);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(3);
        Integer value = queue.dequeue();
        assertEquals(new Integer(5), value);
    }
}
