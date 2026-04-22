package gemini.cemal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJava79 {
    Java79_decimalToBinary s = new Java79_decimalToBinary();

    @Test
    void testDecimalToBinary() {
        assertEquals("db1111db", s.decimalToBinary(15));
        assertEquals("db100000db", s.decimalToBinary(32));
        assertEquals("db0db", s.decimalToBinary(0)); // Boundary value: 0
        assertEquals("db1100111db", s.decimalToBinary(103));
    }
}
