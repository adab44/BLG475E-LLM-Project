/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class TestJava160JUnit {
    Solution s = new Solution();

    @Test
    public void testExponentiation() {
        Assert.assertEquals(37,
            s.doAlgebra(new ArrayList<>(Arrays.asList("**", "*", "+")),
                        new ArrayList<>(Arrays.asList(2, 3, 4, 5))));
    }

    @Test
    public void testMixed() {
        Assert.assertEquals(9,
            s.doAlgebra(new ArrayList<>(Arrays.asList("+", "*", "-")),
                        new ArrayList<>(Arrays.asList(2, 3, 4, 5))));
    }

    @Test
    public void testDivisionMultiplication() {
        Assert.assertEquals(8,
            s.doAlgebra(new ArrayList<>(Arrays.asList("/", "*")),
                        new ArrayList<>(Arrays.asList(7, 3, 4))));
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(5,
            s.doAlgebra(new ArrayList<>(Arrays.asList("+")),
                        new ArrayList<>(Arrays.asList(2, 3))));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(2,
            s.doAlgebra(new ArrayList<>(Arrays.asList("-")),
                        new ArrayList<>(Arrays.asList(5, 3))));
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(12,
            s.doAlgebra(new ArrayList<>(Arrays.asList("*")),
                        new ArrayList<>(Arrays.asList(3, 4))));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2,
            s.doAlgebra(new ArrayList<>(Arrays.asList("/")),
                        new ArrayList<>(Arrays.asList(7, 3))));
    }

    @Test
    public void testSingleExponent() {
        Assert.assertEquals(8,
            s.doAlgebra(new ArrayList<>(Arrays.asList("**")),
                        new ArrayList<>(Arrays.asList(2, 3))));
    }

    @Test
    public void testZeroOperand() {
        Assert.assertEquals(0,
            s.doAlgebra(new ArrayList<>(Arrays.asList("+")),
                        new ArrayList<>(Arrays.asList(0, 0))));
    }

    @Test
    public void testDivisionRemainder() {
        Assert.assertEquals(3,
            s.doAlgebra(new ArrayList<>(Arrays.asList("/")),
                        new ArrayList<>(Arrays.asList(7, 2))));
    }
}
