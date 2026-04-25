/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

public class TestJava145JUnit {
    Solution s = new Solution();

    @Test
    public void testMixed() {
        Assert.assertEquals(Arrays.asList(-1, -11, 1, -12, 11),
            s.orderByPoints(new ArrayList<>(Arrays.asList(1, 11, -1, -11, -12))));
    }

    @Test
    public void testEmptyList() {
        Assert.assertEquals(List.of(),
            s.orderByPoints(new ArrayList<>(List.of())));
    }

    @Test
    public void testNegative() {
        Assert.assertEquals(Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54),
            s.orderByPoints(new ArrayList<>(Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3))));
    }

    @Test
    public void testSingleElement() {
        Assert.assertEquals(Arrays.asList(5),
            s.orderByPoints(new ArrayList<>(Arrays.asList(5))));
    }

    @Test
    public void testSameDigitSum() {
        Assert.assertEquals(Arrays.asList(0, 11, 2),
            s.orderByPoints(new ArrayList<>(Arrays.asList(0, 11, 2))));
    }
}
