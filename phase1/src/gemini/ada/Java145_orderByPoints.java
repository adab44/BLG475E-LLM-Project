/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
class Solution {
    public List<Integer> orderByPoints(List<Integer> nums) {
        List<Integer> result = new ArrayList<>(nums);
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(getDigitSum(a), getDigitSum(b));
            }
        });
        return result;
    }
    private int getDigitSum(int n) {
        int sum = 0;
        int num = Math.abs(n);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
