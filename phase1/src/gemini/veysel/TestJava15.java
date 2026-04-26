/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */

import java.util.*;
import java.lang.*;

public class TestJava15 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.stringSequence(0).equals("0"),
                s.stringSequence(3).equals("0 1 2 3"),
                s.stringSequence(10).equals("0 1 2 3 4 5 6 7 8 9 10")
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java15 stringSequence - FAILED");
        } else {
            System.out.println("✅ Java15 stringSequence - PASSED");
        }
    }
}