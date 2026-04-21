/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public int chooseNum(int x, int y) {
        if (y < x) return -1;
        if (y % 2 == 0) return y;
        if (y - 1 >= x) return y - 1;
        return -1;
    }
}
