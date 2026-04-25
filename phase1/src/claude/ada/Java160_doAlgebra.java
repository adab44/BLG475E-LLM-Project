/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public int doAlgebra(List<String> operator, List<Integer> operand) {
        List<String> ops = new ArrayList<>(operator);
        List<Long> nums = new ArrayList<>();
        for (int n : operand) nums.add((long) n);
        // ** evaluated right to left
        for (int i = ops.size() - 1; i >= 0; i--) {
            if (ops.get(i).equals("**")) {
                long result = (long) Math.pow(nums.get(i), nums.get(i + 1));
                nums.set(i, result);
                nums.remove(i + 1);
                ops.remove(i);
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("*") || ops.get(i).equals("/")) {
                long result = ops.get(i).equals("*") ? nums.get(i) * nums.get(i + 1) : nums.get(i) / nums.get(i + 1);
                nums.set(i, result);
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("+") || ops.get(i).equals("-")) {
                long result = ops.get(i).equals("+") ? nums.get(i) + nums.get(i + 1) : nums.get(i) - nums.get(i + 1);
                nums.set(i, result);
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        return nums.get(0).intValue();
    }
}
