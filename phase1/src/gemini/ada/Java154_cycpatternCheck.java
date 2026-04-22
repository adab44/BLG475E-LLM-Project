/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public boolean cycpatternCheck(String a, String b) {
        int n = b.length();
        String combined = b + b;
        for (int i = 0; i < n; i++) {
            String rotation = combined.substring(i, i + n);
            if (a.contains(rotation)) return true;
        }
        return false;
    }
}
