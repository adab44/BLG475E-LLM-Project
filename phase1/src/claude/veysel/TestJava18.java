/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */



import java.util.*;
import java.lang.*;

public class TestJava18 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.howManyTimes("", "x") == 0,
                s.howManyTimes("xyxyxyx", "x") == 4,
                s.howManyTimes("cacacacac", "cac") == 4,
                s.howManyTimes("john doe", "john") == 1
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java18 howManyTimes - FAILED");
        } else {
            System.out.println("✅ Java18 howManyTimes - PASSED");
        }
    }
}