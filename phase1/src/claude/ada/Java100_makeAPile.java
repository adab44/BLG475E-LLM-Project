/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public List<Integer> makeAPile(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(n + i * 2);
        }
        return result;
    }
}
