/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava52JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertTrue(s.belowThreshold(Arrays.asList(1, 2, 4, 10), 100));
    }
    @Test
    public void test2() {
        assertFalse(s.belowThreshold(Arrays.asList(1, 20, 4, 10), 5));
    }
    @Test
    public void test3() {
        assertTrue(s.belowThreshold(Arrays.asList(1, 20, 4, 10), 21));
    }
    @Test
    public void test4() {
        assertTrue(s.belowThreshold(Arrays.asList(1, 20, 4, 10), 22));
    }
    @Test
    public void test5() {
        assertTrue(s.belowThreshold(Arrays.asList(1, 8, 4, 10), 11));
    }
    @Test
    public void test6() {
        assertFalse(s.belowThreshold(Arrays.asList(1, 8, 4, 10), 10));
    }
}
