/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;
public class TestJava97JUnit {
    Solution s = new Solution();
    private static final int EXPECTED_148_412    = 16;
    private static final int EXPECTED_19_28      = 72;
    private static final int EXPECTED_2020_1851  = 0;
    private static final int EXPECTED_14_NEG15   = 20;
    private static final int EXPECTED_ZERO_ONE   = 0;
    private static final int EXPECTED_ZERO_ZERO  = 0;
    private static final int EXPECTED_NEG14_NEG15 = 20;
    private static final int EXPECTED_NEG10_ZERO = 0;
    private static final int INPUT_A_1   = 148;
    private static final int INPUT_B_1   = 412;
    private static final int INPUT_A_2   = 19;
    private static final int INPUT_B_2   = 28;
    private static final int INPUT_A_3   = 2020;
    private static final int INPUT_B_3   = 1851;
    private static final int INPUT_A_4   = 14;
    private static final int INPUT_B_4   = -15;
    private static final int INPUT_ZERO  = 0;
    private static final int INPUT_ONE   = 1;
    private static final int INPUT_A_NEG = -14;
    private static final int INPUT_B_NEG = -15;
    private static final int INPUT_NEG10 = -10;
    @Test
    public void testPositiveXPositive() {
        Assertions.assertEquals(EXPECTED_148_412, s.multiply(INPUT_A_1, INPUT_B_1));
    }
    @Test
    public void testPositiveXPositive2() {
        Assertions.assertEquals(EXPECTED_19_28, s.multiply(INPUT_A_2, INPUT_B_2));
    }
    @Test
    public void testZeroLastDigit() {
        Assertions.assertEquals(EXPECTED_2020_1851, s.multiply(INPUT_A_3, INPUT_B_3));
    }
    @Test
    public void testNegativeXPositive() {
        Assertions.assertEquals(EXPECTED_14_NEG15, s.multiply(INPUT_A_4, INPUT_B_4));
    }
    @Test
    public void testZeroInput() {
        Assertions.assertEquals(EXPECTED_ZERO_ONE, s.multiply(INPUT_ZERO, INPUT_ONE));
    }
    @Test
    public void testBothZero() {
        Assertions.assertEquals(EXPECTED_ZERO_ZERO, s.multiply(INPUT_ZERO, INPUT_ZERO));
    }
    @Test
    public void testNegativeXNegative() {
        Assertions.assertEquals(EXPECTED_NEG14_NEG15, s.multiply(INPUT_A_NEG, INPUT_B_NEG));
    }
    @Test
    public void testNegativeXZero() {
        Assertions.assertEquals(EXPECTED_NEG10_ZERO, s.multiply(INPUT_NEG10, INPUT_ZERO));
    }
}
