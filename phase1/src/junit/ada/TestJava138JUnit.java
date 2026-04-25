/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;

public class TestJava138JUnit {
    Solution s = new Solution();

    @Test
    public void testFour() {
        Assert.assertFalse(s.isEqualToSumEven(4));
    }

    @Test
    public void testSix() {
        Assert.assertFalse(s.isEqualToSumEven(6));
    }

    @Test
    public void testEight() {
        Assert.assertTrue(s.isEqualToSumEven(8));
    }

    @Test
    public void testTen() {
        Assert.assertTrue(s.isEqualToSumEven(10));
    }

    @Test
    public void testOdd() {
        Assert.assertFalse(s.isEqualToSumEven(11));
    }

    @Test
    public void testZero() {
        Assert.assertFalse(s.isEqualToSumEven(0));
    }

    @Test
    public void testSmallEven() {
        Assert.assertFalse(s.isEqualToSumEven(2));
    }

    @Test
    public void testNegative() {
        Assert.assertFalse(s.isEqualToSumEven(-4));
    }
}
