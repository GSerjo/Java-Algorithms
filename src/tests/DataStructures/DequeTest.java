package DataStructures;

import com.company.DataStructures.Deque;
import org.junit.Test;
import static org.junit.Assert.*;

public class DequeTest
{
    @Test
    public void isEmpty_newDeque_true()
    {
        Deque deque = new Deque();
        assertTrue(deque.isEmpty());
        assertEquals(0, deque.size());
    }

    @Test
    public void addFirst_newDeque_countIncreased()
    {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(0);
        deque.addFirst(1);
        assertFalse(deque.isEmpty());
        assertEquals(2, deque.size());
    }

    @Test
    public void addLast_newDeque_countIncreased()
    {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addLast(0);
        deque.addLast(1);
        assertFalse(deque.isEmpty());
        assertEquals(2, deque.size());
    }

    @Test
    public void removeFirst_newDeque_countDecreased()
    {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(0);
        deque.addFirst(1);
        Integer result = deque.removeFirst();
        assertEquals(new Integer(1), result);
        assertEquals(1, deque.size());
    }

    @Test
    public void removeLast_newDeque_countDecreased()
    {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addLast(0);
        deque.addLast(1);
        Integer result = deque.removeLast();
        assertEquals(new Integer(1), result);
        assertEquals(1, deque.size());
    }

    @Test
    public void remove_newDeque_countDecreased()
    {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(0);
        deque.addFirst(1);
        Integer result = deque.removeLast();
        assertEquals(new Integer(0), result);
        deque.addLast(2);
        deque.addLast(3);
        result = deque.removeFirst();
        assertEquals(new Integer(1), result);
        assertEquals(2, deque.size());
    }
}
