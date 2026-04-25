/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava79JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertEquals("db0db", s.decimalToBinary(0));
    }
    @Test
    public void test2() {
        assertEquals("db100000db", s.decimalToBinary(32));
    }
    @Test
    public void test3() {
        assertEquals("db1100111db", s.decimalToBinary(103));
    }
    @Test
    public void test4() {
        assertEquals("db1111db", s.decimalToBinary(15));
    }
}
