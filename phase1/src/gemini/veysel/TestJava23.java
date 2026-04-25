/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

public class TestJava23 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.strlen("") == 0,
                s.strlen("x") == 1,
                s.strlen("asdasnakj") == 9
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}