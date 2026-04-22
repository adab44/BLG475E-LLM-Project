/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    >>> stringSequence(0)
    "0"
    >>> stringSequence(5)
    "0 1 2 3 4 5"
     */
    public String stringSequence(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i > 0) sb.append(" ");
            sb.append(i);
        }
        return sb.toString();
    }
}