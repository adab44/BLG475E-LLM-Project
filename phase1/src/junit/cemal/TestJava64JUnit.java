/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava64JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertEquals(2, s.vowelsCount("abcde"));
    }
    @Test
    public void test2() {
        assertEquals(3, s.vowelsCount("Alone"));
    }
    @Test
    public void test3() {
        assertEquals(2, s.vowelsCount("key"));
    }
    @Test
    public void test4() {
        assertEquals(1, s.vowelsCount("bye"));
    }
    @Test
    public void test5() {
        assertEquals(2, s.vowelsCount("keY"));
    }
    @Test
    public void test6() {
        assertEquals(1, s.vowelsCount("bYe"));
    }
    @Test
    public void test7() {
        assertEquals(3, s.vowelsCount("ACEDY"));
    }
}
