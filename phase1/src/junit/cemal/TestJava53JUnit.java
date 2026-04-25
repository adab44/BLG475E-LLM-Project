/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class TestJava53JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertEquals(1, s.add(0, 1));
    }
    @Test
    public void test2() {
        assertEquals(1, s.add(1, 0));
    }
    @Test
    public void test3() {
        assertEquals(5, s.add(2, 3));
    }
    @Test
    public void test4() {
        assertEquals(12, s.add(5, 7));
    }
    @Test
    public void test5() {
        assertEquals(12, s.add(7, 5));
    }
    @Test
    public void testRandom() {
        Random rand = new Random(42);
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt(1000), y = rand.nextInt(1000);
            assertEquals(x + y, s.add(x, y));
        }
    }
}
