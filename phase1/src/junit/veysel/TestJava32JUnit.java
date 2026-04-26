/* @Authors 
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TestJava32JUnit {
    Solution s = new Solution();

    @Test
    public void testPolyEvaluation() {
        assertEquals(4.0, s.poly(Arrays.asList(1.0, 2.0, 1.0), 1.0), 0.001);
    }

    @Test
    public void testSimpleRoot() {
        double root = s.findZero(Arrays.asList(1.0, 2.0));
        assertEquals(-0.5, root, 0.01);
    }

    @Test
    public void testCubicRoot() {
        double root = s.findZero(Arrays.asList(-6.0, 11.0, -6.0, 1.0));
        assertEquals(1.0, root, 0.01);
    }

    @Test
    public void testNegativeRoot() {
        double root = s.findZero(Arrays.asList(4.0, 2.0));
        assertEquals(-2.0, root, 0.01);
    }
}