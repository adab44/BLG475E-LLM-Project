/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava119JUnit {
    Solution s = new Solution();

    @Test
    public void test1() {
        assertEquals("Yes", s.matchParens(Arrays.asList("()(", ")")));
    }
    @Test
    public void test2() {
        assertEquals("No", s.matchParens(Arrays.asList(")", ")")));
    }
    @Test
    public void test3() {
        assertEquals("No", s.matchParens(Arrays.asList("(()(())", "())())")));
    }
    @Test
    public void test4() {
        assertEquals("Yes", s.matchParens(Arrays.asList(")())", "(()()(")));
    }
    @Test
    public void test5() {
        assertEquals("Yes", s.matchParens(Arrays.asList("(())))", "(()())((")));
    }
    @Test
    public void test6() {
        assertEquals("No", s.matchParens(Arrays.asList("()", "())")));
    }
    @Test
    public void test7() {
        assertEquals("Yes", s.matchParens(Arrays.asList("(()(", "()))()")));
    }
    @Test
    public void test8() {
        assertEquals("No", s.matchParens(Arrays.asList("((((", "((())")));
    }
    @Test
    public void test9() {
        assertEquals("No", s.matchParens(Arrays.asList(")(()", "(()(")));
    }
    @Test
    public void test10() {
        assertEquals("No", s.matchParens(Arrays.asList(")(", ")(")));
    }
}
