/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava124JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertTrue(s.validDate("03-11-2000"));
    }
    @Test
    public void test2() {
        assertFalse(s.validDate("15-01-2012"));
    }
    @Test
    public void test3() {
        assertFalse(s.validDate("04-0-2040"));
    }
    @Test
    public void test4() {
        assertTrue(s.validDate("06-04-2020"));
    }
    @Test
    public void test5() {
        assertTrue(s.validDate("01-01-2007"));
    }
    @Test
    public void test6() {
        assertFalse(s.validDate("03-32-2011"));
    }
    @Test
    public void test7() {
        assertFalse(s.validDate(""));
    }
    @Test
    public void test8() {
        assertFalse(s.validDate("04-31-3000"));
    }
    @Test
    public void test9() {
        assertTrue(s.validDate("06-06-2005"));
    }
    @Test
    public void test10() {
        assertFalse(s.validDate("21-31-2000"));
    }
    @Test
    public void test11() {
        assertTrue(s.validDate("04-12-2003"));
    }
    @Test
    public void test12() {
        assertFalse(s.validDate("04122003"));
    }
    @Test
    public void test13() {
        assertFalse(s.validDate("20030412"));
    }
    @Test
    public void test14() {
        assertFalse(s.validDate("2003-04"));
    }
    @Test
    public void test15() {
        assertFalse(s.validDate("2003-04-12"));
    }
    @Test
    public void test16() {
        assertFalse(s.validDate("04-2003"));
    }
}
