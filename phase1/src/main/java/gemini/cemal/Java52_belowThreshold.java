package gemini.cemal;
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

public class Java52_belowThreshold {
    public boolean belowThreshold(List<Integer> l, int t) {
        for (int e : l) {
            if (e >= t) {
                return false;
            }
        }
        return true;
    }
}
