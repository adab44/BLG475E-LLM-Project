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
        String s = String.valueOf(n);
        int sum = 0;
        int startIdx = 0;
        boolean isNegative = false;

        if (n < 0) {
            isNegative = true;
            startIdx = 1;
        }

        for (int i = startIdx; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (isNegative && i == startIdx) {
                sum -= digit;
            } else {
                sum += digit;
            }
        }
        return sum;
    }
}
