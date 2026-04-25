import java.util.*;
import java.lang.*;
public class TestJava154 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.cycpatternCheck("xyzw", "xyw") == false,
                s.cycpatternCheck("yello", "ell") == true,
                s.cycpatternCheck("whattup", "ptut") == false,
                s.cycpatternCheck("efef", "fee") == true,
                s.cycpatternCheck("abab", "aabb") == false,
                s.cycpatternCheck("winemtt", "tinem") == true,
                s.cycpatternCheck("ab", "abc") == false,    // b uzunluğu a'dan büyük
                s.cycpatternCheck("hello", "h") == true,   // tek karakterli pattern
                s.cycpatternCheck("abc", "abc") == true    // eşit uzunluk
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java154 cycpatternCheck - FAILED");
        } else {
            System.out.println("✅ Java154 cycpatternCheck - PASSED");
        }
    }
}
