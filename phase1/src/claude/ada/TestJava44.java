import java.util.*;
import java.lang.*;
public class TestJava44 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.changeBase(8, 3), "22"),
                Objects.equals(s.changeBase(9, 3), "100"),
                Objects.equals(s.changeBase(234, 2), "11101010"),
                Objects.equals(s.changeBase(16, 2), "10000"),
                Objects.equals(s.changeBase(8, 2), "1000"),
                Objects.equals(s.changeBase(7, 2), "111")
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java44 changeBase - FAILED");
        } else {
            System.out.println("✅ Java44 changeBase - PASSED");
        }
    }
}
