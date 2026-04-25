/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava109JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertTrue(s.moveOneBall(Arrays.asList(3, 4, 5, 1, 2)));
    }
    @Test
    public void test2() {
        assertTrue(s.moveOneBall(Arrays.asList(3, 5, 10, 1, 2)));
    }
    @Test
    public void test3() {
        assertFalse(s.moveOneBall(Arrays.asList(4, 3, 1, 2)));
    }
    @Test
    public void test4() {
        assertFalse(s.moveOneBall(Arrays.asList(3, 5, 4, 1, 2)));
    }
    @Test
    public void test5() {
        assertTrue(s.moveOneBall(new ArrayList<>()));
    }
}
