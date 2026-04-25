/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestJava138JUnit {
    Solution s = new Solution();
    private static final int INPUT_FOUR       = 4;
    private static final int INPUT_SIX        = 6;
    private static final int INPUT_EIGHT      = 8;
    private static final int INPUT_TEN        = 10;
    private static final int INPUT_ODD        = 11;
    private static final int INPUT_ZERO       = 0;
    private static final int INPUT_SMALL_EVEN = 2;
    private static final int INPUT_NEGATIVE   = -4;
    @Test
    public void testFour() {
        Assertions.assertFalse(s.isEqualToSumEven(INPUT_FOUR));
    }
    @Test
    public void testSix() {
        Assertions.assertFalse(s.isEqualToSumEven(INPUT_SIX));
    }
    @Test
    public void testEight() {
        Assertions.assertTrue(s.isEqualToSumEven(INPUT_EIGHT));
    }
    @Test
    public void testTen() {
        Assertions.assertTrue(s.isEqualToSumEven(INPUT_TEN));
    }
    @Test
    public void testOdd() {
        Assertions.assertFalse(s.isEqualToSumEven(INPUT_ODD));
    }
    @Test
    public void testZero() {
        Assertions.assertFalse(s.isEqualToSumEven(INPUT_ZERO));
    }
    @Test
    public void testSmallEven() {
        Assertions.assertFalse(s.isEqualToSumEven(INPUT_SMALL_EVEN));
    }
    @Test
    public void testNegative() {
        Assertions.assertFalse(s.isEqualToSumEven(INPUT_NEGATIVE));
    }
}
