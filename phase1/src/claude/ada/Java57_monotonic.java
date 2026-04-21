/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public boolean monotonic(List<Integer> l) {
        boolean increasing = true, decreasing = true;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) > l.get(i - 1)) decreasing = false;
            if (l.get(i) < l.get(i - 1)) increasing = false;
        }
        return increasing || decreasing;
    }
}
