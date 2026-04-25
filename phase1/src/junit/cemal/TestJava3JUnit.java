/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava3JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertFalse(s.belowZero(new ArrayList<>()));
    }
    @Test
    public void test2() {
        assertFalse(s.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
    }
    @Test
    public void test3() {
        assertTrue(s.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
    }
    @Test
    public void test4() {
        assertFalse(s.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
    }
    @Test
    public void test5() {
        assertTrue(s.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
    }
    @Test
    public void test6() {
        assertTrue(s.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));
    }
}
