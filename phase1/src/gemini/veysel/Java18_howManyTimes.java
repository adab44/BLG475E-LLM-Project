/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */



import java.util.*;
import java.lang.*;

class Solution {
    /**
    Find how many times a given substring can be found in the original string. Count overlapping cases.
    >>> howManyTimes("", "a")
    0
    >>> howManyTimes("aaa", "a")
    3
    >>> howManyTimes("aaaa", "aa")
    3
     */
    public int howManyTimes(String string, String substring) {
        // Handle edge case: if substring is empty, typically we return 0 or 
        // the length of the string + 1, but based on your test cases, 
        // we'll return 0 if the substring is empty to prevent infinite loops.
        if (substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int n = string.length();
        int m = substring.length();

        // Iterate through the string up to the point where the substring can still fit
        for (int i = 0; i <= n - m; i++) {
            // Check if the substring matches the portion of the string starting at index i
            if (string.substring(i, i + m).equals(substring)) {
                count++;
            }
        }

        return count;
    }
}