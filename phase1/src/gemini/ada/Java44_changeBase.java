/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public String changeBase(int x, int base) {
        if (x == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (x > 0) {
            int remainder = x % base;
            result.append(remainder);
            x = x / base;
        }
        return result.reverse().toString();
    }
}
