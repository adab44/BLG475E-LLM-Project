import java.util.*;
import java.lang.*;
public class TestJava100 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.makeAPile(3).equals(Arrays.asList(3, 5, 7)),
                s.makeAPile(4).equals(Arrays.asList(4, 6, 8, 10)),
                s.makeAPile(5).equals(Arrays.asList(5, 7, 9, 11, 13)),
                s.makeAPile(6).equals(Arrays.asList(6, 8, 10, 12, 14, 16)),
                s.makeAPile(8).equals(Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22)),
                s.makeAPile(1).equals(Arrays.asList(1)),      // minimum n
                s.makeAPile(2).equals(Arrays.asList(2, 4))   // en küçük çift n
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java100 makeAPile - FAILED");
        } else {
            System.out.println("✅ Java100 makeAPile - PASSED");
        }
    }
}
