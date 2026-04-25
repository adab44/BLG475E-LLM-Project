/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava45JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertEquals(7.5, s.triangleArea(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(2.0, s.triangleArea(2, 2));
    }
    @Test
    public void test3() {
        assertEquals(40.0, s.triangleArea(10, 8));
    }
}
