/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */

import java.util.*;
import java.lang.*;

class Solution {
    /**
    This function takes two positive numbers x and y and returns the
    biggest even integer number that is in the range [x, y] inclusive. If
    there's no such number, then the function should return -1.
    
    For example:
    chooseNum(12, 15) = 14
    chooseNum(13, 12) = -1
     */
    public int chooseNum(int x, int y) {
        if (x > y) return -1;
        
        // If y is even, it's already the biggest even number in range
        if (y % 2 == 0) return y;
        
        // Otherwise, try the number just below y
        int candidate = y - 1;
        return candidate >= x ? candidate : -1;
    }
}