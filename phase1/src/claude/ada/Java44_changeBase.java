/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public String changeBase(int x, int base) {
        StringBuilder result = new StringBuilder();
        while (x > 0) {
            result.insert(0, x % base);
            x /= base;
        }
        return result.toString();
    }
}
