/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 *//* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a string, find out how many distinct characters (regardless of case) does it consist of
    >>> countDistinctCharacters("xyzXYZ")
    3
    >>> countDistinctCharacters("Jerry")
    4
     */
    public int countDistinctCharacters(String string) {
        Set<Character> distinctChars = new HashSet<>();
        
        for (char c : string.toLowerCase().toCharArray()) {
            distinctChars.add(c);
        }
        
        return distinctChars.size();
    }
}
