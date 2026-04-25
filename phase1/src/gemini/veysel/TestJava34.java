/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */



import java.util.*;
import java.lang.*;

public class TestJava34 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.unique(new ArrayList<>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))).equals(Arrays.asList(0, 2, 3, 5, 9, 123))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}