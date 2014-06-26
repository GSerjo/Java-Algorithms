package DataStructures;
import com.company.DataStructures.StackOfStrings;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackOfStringsTest
{
    @Test
    public void isEmpty_newStack_true()
    {
        StackOfStrings stack = new StackOfStrings();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }
}
