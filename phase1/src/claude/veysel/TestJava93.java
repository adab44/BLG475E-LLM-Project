/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

public class TestJava93 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.encode("TEST"), "tgst"),
                Objects.equals(s.encode("Mudasir"), "mWDCSKR"),
                Objects.equals(s.encode("YES"), "ygs"),
                Objects.equals(s.encode("This is a message"), "tHKS KS C MGSSCGG"),
                Objects.equals(s.encode("I DoNt KnOw WhAt tO WrItE"), "k dQnT kNqW wHcT Tq wRkTg")
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java93 encode - FAILED");
        } else {
            System.out.println("✅ Java93 encode - PASSED");
        }
    }
}