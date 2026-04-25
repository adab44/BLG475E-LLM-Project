/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;

public class TestJava44JUnit {
    Solution s = new Solution();

    @Test
    public void testBase3() {
        Assert.assertEquals("22", s.changeBase(8, 3));
    }

    @Test
    public void testBase3v2() {
        Assert.assertEquals("100", s.changeBase(9, 3));
    }

    @Test
    public void testBase2Large() {
        Assert.assertEquals("11101010", s.changeBase(234, 2));
    }

    @Test
    public void testBase2() {
        Assert.assertEquals("1000", s.changeBase(8, 2));
    }

    @Test
    public void testBase2v2() {
        Assert.assertEquals("111", s.changeBase(7, 2));
    }

    @Test
    public void testMinimumX() {
        Assert.assertEquals("1", s.changeBase(1, 2));
    }

    @Test
    public void testLargeX() {
        Assert.assertEquals("11111111", s.changeBase(255, 2));
    }

    @Test
    public void testBase9() {
        Assert.assertEquals("8", s.changeBase(8, 9));
    }
}
