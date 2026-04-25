/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 *//* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

public class TestJava16 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.countDistinctCharacters("") == 0,
                s.countDistinctCharacters("abcde") == 5,
                s.countDistinctCharacters("abcde" + "cade" + "CADE") == 5,
                s.countDistinctCharacters("aaaaAAAAaaaa") == 1,
                s.countDistinctCharacters("Jerry jERRY JeRRRY") == 5
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}