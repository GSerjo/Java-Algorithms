package Sorting;
import com.company.Sorting.Selection;
import com.company.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionTest {

    @Test
    public void sort_newList_true(){
        Comparable[] list = createData(5);
        Selection.sort(list);
        assertTrue(Selection.isSorted(list));
    }

    private Comparable[] createData(int length){
        Comparable[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = StdRandom.uniform(10);
        }
        return result;
    }
}
