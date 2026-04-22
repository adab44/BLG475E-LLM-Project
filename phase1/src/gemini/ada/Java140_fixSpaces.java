/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public String fixSpaces(String text) {
        String result = text.replaceAll(" {3,}", "-");
        result = result.replace(" ", "_");
        return result;
    }
}
