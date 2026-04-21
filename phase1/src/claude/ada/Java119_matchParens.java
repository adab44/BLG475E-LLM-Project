/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public String matchParens(List<String> lst) {
        return isBalanced(lst.get(0) + lst.get(1)) || isBalanced(lst.get(1) + lst.get(0)) ? "Yes" : "No";
    }
    private boolean isBalanced(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;
            if (count < 0) return false;
        }
        return count == 0;
    }
}
