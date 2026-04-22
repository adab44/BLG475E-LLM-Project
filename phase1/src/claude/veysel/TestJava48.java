/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

public class TestJava48{
     public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.isPalindrome(""),
                s.isPalindrome("aba"),
                s.isPalindrome("aaaaa"),
                !s.isPalindrome("zbcd"),
                s.isPalindrome("xywyx"),
                !s.isPalindrome("xywyz"),
                !s.isPalindrome("xywzx")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}