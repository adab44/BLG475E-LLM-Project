/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;
public class TestJava145JUnit {
    Solution s = new Solution();
    private static final List<Integer> INPUT_MIXED =
        new ArrayList<>(Arrays.asList(1, 11, -1, -11, -12));
    private static final List<Integer> EXPECTED_MIXED =
        Arrays.asList(-1, -11, 1, -12, 11);
    private static final List<Integer> INPUT_EMPTY =
        new ArrayList<>(List.of());
    private static final List<Integer> EXPECTED_EMPTY =
        List.of();
    private static final List<Integer> INPUT_NEGATIVE =
        new ArrayList<>(Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3));
    private static final List<Integer> EXPECTED_NEGATIVE =
        Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54);
    private static final List<Integer> INPUT_SINGLE =
        new ArrayList<>(Arrays.asList(5));
    private static final List<Integer> EXPECTED_SINGLE =
        Arrays.asList(5);
    private static final List<Integer> INPUT_SAME_DIGIT_SUM =
        new ArrayList<>(Arrays.asList(0, 11, 2));
    private static final List<Integer> EXPECTED_SAME_DIGIT_SUM =
        Arrays.asList(0, 11, 2);
    @Test
    public void testMixed() {
        Assertions.assertEquals(EXPECTED_MIXED, s.orderByPoints(INPUT_MIXED));
    }
    @Test
    public void testEmptyList() {
        Assertions.assertEquals(EXPECTED_EMPTY, s.orderByPoints(INPUT_EMPTY));
    }
    @Test
    public void testNegative() {
        Assertions.assertEquals(EXPECTED_NEGATIVE, s.orderByPoints(INPUT_NEGATIVE));
    }
    @Test
    public void testSingleElement() {
        Assertions.assertEquals(EXPECTED_SINGLE, s.orderByPoints(INPUT_SINGLE));
    }
    @Test
    public void testSameDigitSum() {
        Assertions.assertEquals(EXPECTED_SAME_DIGIT_SUM, s.orderByPoints(INPUT_SAME_DIGIT_SUM));
    }
}
