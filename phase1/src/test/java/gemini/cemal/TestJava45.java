package gemini.cemal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava45 {
    Java45_triangleArea s = new Java45_triangleArea();

    @Test
    void testTriangleArea() {
        assertEquals(7.5, s.area(5, 3));
        assertEquals(2.0, s.area(2, 2));
        assertEquals(40.0, s.area(10, 8));
        assertEquals(0.0, s.area(0, 10)); // Boundary value: Zero side
    }
}
