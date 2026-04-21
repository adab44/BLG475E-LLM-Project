/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public boolean cycpatternCheck(String a, String b) {
        String doubled = b + b;
        for (int i = 0; i < b.length(); i++) {
            if (a.contains(doubled.substring(i, i + b.length()))) return true;
        }
        return false;
    }
}
