/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;
public class TestJava160JUnit {
    Solution s = new Solution();
    private static final int EXPECTED_EXPONENTIATION     = 37;
    private static final int EXPECTED_MIXED              = 9;
    private static final int EXPECTED_DIV_MUL            = 8;
    private static final int EXPECTED_ADDITION           = 5;
    private static final int EXPECTED_SUBTRACTION        = 2;
    private static final int EXPECTED_MULTIPLICATION     = 12;
    private static final int EXPECTED_DIVISION           = 2;
    private static final int EXPECTED_SINGLE_EXPONENT    = 8;
    private static final int EXPECTED_ZERO               = 0;
    private static final int EXPECTED_DIVISION_REMAINDER = 3;
    private static final List<String>  OPS_EXPONENTIATION = new ArrayList<>(Arrays.asList("**", "*", "+"));
    private static final List<String>  OPS_MIXED          = new ArrayList<>(Arrays.asList("+", "*", "-"));
    private static final List<String>  OPS_DIV_MUL        = new ArrayList<>(Arrays.asList("/", "*"));
    private static final List<String>  OPS_ADD            = new ArrayList<>(Arrays.asList("+"));
    private static final List<String>  OPS_SUB            = new ArrayList<>(Arrays.asList("-"));
    private static final List<String>  OPS_MUL            = new ArrayList<>(Arrays.asList("*"));
    private static final List<String>  OPS_DIV            = new ArrayList<>(Arrays.asList("/"));
    private static final List<String>  OPS_EXP            = new ArrayList<>(Arrays.asList("**"));
    private static final List<Integer> OPERANDS_2_3_4_5  = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
    private static final List<Integer> OPERANDS_7_3_4    = new ArrayList<>(Arrays.asList(7, 3, 4));
    private static final List<Integer> OPERANDS_2_3      = new ArrayList<>(Arrays.asList(2, 3));
    private static final List<Integer> OPERANDS_5_3      = new ArrayList<>(Arrays.asList(5, 3));
    private static final List<Integer> OPERANDS_3_4      = new ArrayList<>(Arrays.asList(3, 4));
    private static final List<Integer> OPERANDS_7_3      = new ArrayList<>(Arrays.asList(7, 3));
    private static final List<Integer> OPERANDS_7_2      = new ArrayList<>(Arrays.asList(7, 2));
    private static final List<Integer> OPERANDS_0_0      = new ArrayList<>(Arrays.asList(0, 0));
    @Test
    public void testExponentiation() {
        Assertions.assertEquals(EXPECTED_EXPONENTIATION, s.doAlgebra(OPS_EXPONENTIATION, OPERANDS_2_3_4_5));
    }
    @Test
    public void testMixed() {
        Assertions.assertEquals(EXPECTED_MIXED, s.doAlgebra(OPS_MIXED, OPERANDS_2_3_4_5));
    }
    @Test
    public void testDivisionMultiplication() {
        Assertions.assertEquals(EXPECTED_DIV_MUL, s.doAlgebra(OPS_DIV_MUL, OPERANDS_7_3_4));
    }
    @Test
    public void testAddition() {
        Assertions.assertEquals(EXPECTED_ADDITION, s.doAlgebra(OPS_ADD, OPERANDS_2_3));
    }
    @Test
    public void testSubtraction() {
        Assertions.assertEquals(EXPECTED_SUBTRACTION, s.doAlgebra(OPS_SUB, OPERANDS_5_3));
    }
    @Test
    public void testMultiplication() {
        Assertions.assertEquals(EXPECTED_MULTIPLICATION, s.doAlgebra(OPS_MUL, OPERANDS_3_4));
    }
    @Test
    public void testDivision() {
        Assertions.assertEquals(EXPECTED_DIVISION, s.doAlgebra(OPS_DIV, OPERANDS_7_3));
    }
    @Test
    public void testSingleExponent() {
        Assertions.assertEquals(EXPECTED_SINGLE_EXPONENT, s.doAlgebra(OPS_EXP, OPERANDS_2_3));
    }
    @Test
    public void testZeroOperand() {
        Assertions.assertEquals(EXPECTED_ZERO, s.doAlgebra(OPS_ADD, OPERANDS_0_0));
    }
    @Test
    public void testDivisionRemainder() {
        Assertions.assertEquals(EXPECTED_DIVISION_REMAINDER, s.doAlgebra(OPS_DIV, OPERANDS_7_2));
    }
}
