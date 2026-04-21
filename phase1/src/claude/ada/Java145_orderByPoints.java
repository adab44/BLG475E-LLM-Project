/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public List<Integer> orderByPoints(List<Integer> nums) {
        List<Integer> result = new ArrayList<>(nums);
        result.sort(Comparator.comparingInt(this::digitSum));
        return result;
    }
    private int digitSum(int n) {
        String s = String.valueOf(Math.abs(n));
        int sum = 0;
        for (char c : s.toCharArray()) sum += c - '0';
        return n < 0 ? sum - 2 * (s.charAt(0) - '0') : sum;
    }
}
