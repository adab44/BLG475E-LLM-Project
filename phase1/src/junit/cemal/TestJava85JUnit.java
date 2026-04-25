/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava85JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertEquals(88, s.add(Arrays.asList(4, 88)));
    }
    @Test
    public void test2() {
        assertEquals(122, s.add(Arrays.asList(4, 5, 6, 7, 2, 122)));
    }
    @Test
    public void test3() {
        assertEquals(0, s.add(Arrays.asList(4, 0, 6, 7)));
    }
    @Test
    public void test4() {
        assertEquals(12, s.add(Arrays.asList(4, 4, 6, 8)));
    }
}
