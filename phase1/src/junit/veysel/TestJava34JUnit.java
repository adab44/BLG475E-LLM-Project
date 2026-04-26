/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava34JUnit {
    Solution s = new Solution();

    @Test
    public void testDuplicates() {
        assertEquals(
            Arrays.asList(0, 2, 3, 5, 9, 123),
            s.unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
        );
    }

    @Test
    public void testAlreadySorted() {
        assertEquals(
            Arrays.asList(1, 2, 3),
            s.unique(Arrays.asList(1, 2, 3))
        );
    }

    @Test
    public void testEmptyList() {
        assertEquals(
            Arrays.asList(),
            s.unique(Arrays.asList())
        );
    }

    @Test
    public void testSingleElement() {
        assertEquals(
            Arrays.asList(7),
            s.unique(Arrays.asList(7))
        );
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(
            Arrays.asList(-3, -1, 0),
            s.unique(Arrays.asList(-1, -3, 0, -1))
        );
    }
}