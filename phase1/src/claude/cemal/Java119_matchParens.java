
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    String matchParens(List<String> lst) {
        String s1 = lst.get(0) + lst.get(1);
        String s2 = lst.get(1) + lst.get(0);

        return (isBalanced(s1) || isBalanced(s2)) ? "Yes" : "No";
    }

    private boolean isBalanced(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}