/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;
public class TestJava100JUnit {
    Solution s = new Solution();
    private static final int INPUT_N1 = 1;
    private static final int INPUT_N2 = 2;
    private static final int INPUT_N3 = 3;
    private static final int INPUT_N4 = 4;
    private static final int INPUT_N5 = 5;
    private static final int INPUT_N6 = 6;
    private static final List<Integer> EXPECTED_N1 = Arrays.asList(1);
    private static final List<Integer> EXPECTED_N2 = Arrays.asList(2, 4);
    private static final List<Integer> EXPECTED_N3 = Arrays.asList(3, 5, 7);
    private static final List<Integer> EXPECTED_N4 = Arrays.asList(4, 6, 8, 10);
    private static final List<Integer> EXPECTED_N5 = Arrays.asList(5, 7, 9, 11, 13);
    private static final List<Integer> EXPECTED_N6 = Arrays.asList(6, 8, 10, 12, 14, 16);
    @Test
    public void testOddNumber() {
        Assertions.assertEquals(EXPECTED_N3, s.makeAPile(INPUT_N3));
    }
    @Test
    public void testEvenNumber() {
        Assertions.assertEquals(EXPECTED_N4, s.makeAPile(INPUT_N4));
    }
    @Test
    public void testN5() {
        Assertions.assertEquals(EXPECTED_N5, s.makeAPile(INPUT_N5));
    }
    @Test
    public void testN6() {
        Assertions.assertEquals(EXPECTED_N6, s.makeAPile(INPUT_N6));
    }
    @Test
    public void testMinimumN() {
        Assertions.assertEquals(EXPECTED_N1, s.makeAPile(INPUT_N1));
    }
    @Test
    public void testSmallestEvenN() {
        Assertions.assertEquals(EXPECTED_N2, s.makeAPile(INPUT_N2));
    }
}
