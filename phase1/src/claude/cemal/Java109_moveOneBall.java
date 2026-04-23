
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    boolean moveOneBall(List<Integer> arr) {
        if (arr.isEmpty()) {
            return true;
        }

        int dropCount = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                dropCount++;
            }
        }

        if (arr.get(arr.size() - 1) > arr.get(0)) {
            dropCount++;
        }

        return dropCount <= 1;
    }
}