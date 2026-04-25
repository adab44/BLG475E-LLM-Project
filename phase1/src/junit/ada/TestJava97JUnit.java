/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class TestJava97JUnit {
    Solution s = new Solution();

    @Test
    public void testPositiveXPositive() {
        Assert.assertEquals(16, s.multiply(148, 412));
    }

    @Test
    public void testPositiveXPositive2() {
        Assert.assertEquals(72, s.multiply(19, 28));
    }

    @Test
    public void testZeroLastDigit() {
        Assert.assertEquals(0, s.multiply(2020, 1851));
    }

    @Test
    public void testNegativeXPositive() {
        Assert.assertEquals(20, s.multiply(14, -15));
    }

    @Test
    public void testZeroInput() {
        Assert.assertEquals(0, s.multiply(0, 1));
    }

    @Test
    public void testBothZero() {
        Assert.assertEquals(0, s.multiply(0, 0));
    }

    @Test
    public void testNegativeXNegative() {
        Assert.assertEquals(20, s.multiply(-14, -15));
    }

    @Test
    public void testNegativeXZero() {
        Assert.assertEquals(0, s.multiply(-10, 0));
    }
}
