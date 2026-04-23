
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    boolean belowThreshold(List<Integer> l, int t) {
        for (int num : l) {
            if (num >= t) {
                return false;
            }
        }

        return true;
    }
}