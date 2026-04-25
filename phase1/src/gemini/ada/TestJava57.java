import java.util.*;
import java.lang.*;
public class TestJava57 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.monotonic(new ArrayList<>(Arrays.asList(1, 2, 4, 10))),
                s.monotonic(new ArrayList<>(Arrays.asList(1, 2, 4, 20))),
                !s.monotonic(new ArrayList<>(Arrays.asList(1, 20, 4, 10))),
                s.monotonic(new ArrayList<>(Arrays.asList(4, 1, 0, -10))),
                s.monotonic(new ArrayList<>(Arrays.asList(4, 1, 1, 0))),
                !s.monotonic(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 60))),
                s.monotonic(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 60))),
                s.monotonic(new ArrayList<>(Arrays.asList(9, 9, 9, 9))),
                s.monotonic(new ArrayList<>(Arrays.asList(1))),        // tek elemanlı liste
                s.monotonic(new ArrayList<>(Arrays.asList(1, 2))),     // iki elemanlı liste
                s.monotonic(new ArrayList<>(Arrays.asList(5, 5))),     // eşit iki eleman
                s.monotonic(new ArrayList<>(Arrays.asList()))           // boş liste
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java57 monotonic - FAILED");
        } else {
            System.out.println("✅ Java57 monotonic - PASSED");
        }
    }
}
