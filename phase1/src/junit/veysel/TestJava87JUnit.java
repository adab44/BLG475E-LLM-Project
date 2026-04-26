/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava87JUnit {
    Solution s = new Solution();

    @Test
    public void testNormalCase() {
        assertEquals(
            Arrays.asList(
                Arrays.asList(0,0),
                Arrays.asList(1,1)
            ),
            s.getRow(Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,1)
            ),1)
        );
    }

    @Test
    public void testEmptyList() {
        assertEquals(List.of(), s.getRow(List.of(), 1));
    }

    @Test
    public void testNoMatch() {
        assertEquals(
            List.of(),
            s.getRow(Arrays.asList(
                Arrays.asList(2,3),
                Arrays.asList(4,5)
            ),1)
        );
    }

    @Test
    public void testDifferentRowLengths() {
        assertEquals(
            Arrays.asList(Arrays.asList(2,2)),
            s.getRow(
                Arrays.asList(
                    List.of(),
                    List.of(1),
                    Arrays.asList(1,2,3)
                ),
                3
            )
        );
    }
}