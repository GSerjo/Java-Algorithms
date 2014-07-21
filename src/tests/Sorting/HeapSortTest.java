package Sorting;

import com.company.Sorting.HeapSort;
import com.company.StdRandom;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HeapSortTest {

    @Test
    public void sort_newList_true(){
        Comparable[] list = createData(5);
        HeapSort.sort(list);
        assertTrue(HeapSort.isSorted(list));
    }

    private Comparable[] createData(int length){
        Comparable[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = StdRandom.uniform(10);
        }
        return result;
    }

}
