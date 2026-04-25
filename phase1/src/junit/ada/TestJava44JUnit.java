/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestJava44JUnit {
    Solution s = new Solution();
    private static final int INPUT_1   = 1;
    private static final int INPUT_7   = 7;
    private static final int INPUT_8   = 8;
    private static final int INPUT_9   = 9;
    private static final int INPUT_234 = 234;
    private static final int INPUT_255 = 255;
    private static final int BASE_2 = 2;
    private static final int BASE_3 = 3;
    private static final int BASE_9 = 9;
    private static final String EXPECTED_8_BASE3   = "22";
    private static final String EXPECTED_9_BASE3   = "100";
    private static final String EXPECTED_234_BASE2 = "11101010";
    private static final String EXPECTED_8_BASE2   = "1000";
    private static final String EXPECTED_7_BASE2   = "111";
    private static final String EXPECTED_1_BASE2   = "1";
    private static final String EXPECTED_255_BASE2 = "11111111";
    private static final String EXPECTED_8_BASE9   = "8";
    @Test
    public void testBase3() {
        Assertions.assertEquals(EXPECTED_8_BASE3, s.changeBase(INPUT_8, BASE_3));
    }
    @Test
    public void testBase3v2() {
        Assertions.assertEquals(EXPECTED_9_BASE3, s.changeBase(INPUT_9, BASE_3));
    }
    @Test
    public void testBase2Large() {
        Assertions.assertEquals(EXPECTED_234_BASE2, s.changeBase(INPUT_234, BASE_2));
    }
    @Test
    public void testBase2() {
        Assertions.assertEquals(EXPECTED_8_BASE2, s.changeBase(INPUT_8, BASE_2));
    }
    @Test
    public void testBase2v2() {
        Assertions.assertEquals(EXPECTED_7_BASE2, s.changeBase(INPUT_7, BASE_2));
    }
    @Test
    public void testMinimumX() {
        Assertions.assertEquals(EXPECTED_1_BASE2, s.changeBase(INPUT_1, BASE_2));
    }
    @Test
    public void testLargeX() {
        Assertions.assertEquals(EXPECTED_255_BASE2, s.changeBase(INPUT_255, BASE_2));
    }
    @Test
    public void testBase9() {
        Assertions.assertEquals(EXPECTED_8_BASE9, s.changeBase(INPUT_8, BASE_9));
    }
}
