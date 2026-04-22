package gemini.cemal;
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

public class Java119_matchParens {
    public String matchParens(List<String> lst) {
        List<String> S = Arrays.asList(lst.get(0) + lst.get(1), lst.get(1) + lst.get(0));
        for (String s : S) {
            int val = 0;
            boolean balanced = true;
            for (char i : s.toCharArray()) {
                if (i == '(') {
                    val += 1;
                } else {
                    val -= 1;
                }
                if (val < 0) {
                    balanced = false;
                    break;
                }
            }
            if (balanced && val == 0) {
                return "Yes";
            }
        }
        return "No";
    }
}
