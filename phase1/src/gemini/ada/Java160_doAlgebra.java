/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;

class Solution {
    public int doAlgebra(List<String> operator, List<Integer> operand) {
        List<Double> values = new ArrayList<>();
        for (int num : operand) {
            values.add((double) num);
        }
        List<String> ops = new ArrayList<>(operator);

        // ** sağdan sola değerlendiriliyor
        for (int i = ops.size() - 1; i >= 0; i--) {
            if (ops.get(i).equals("**")) {
                double res = Math.pow(values.get(i), values.get(i + 1));
                values.set(i, res);
                values.remove(i + 1);
                ops.remove(i);
            }
        }

        for (int i = 0; i < ops.size(); i++) {
            String op = ops.get(i);
            if (op.equals("*") || op.equals("/")) {
                double res = (op.equals("*"))
                    ? values.get(i) * values.get(i + 1)
                    : Math.floor(values.get(i) / values.get(i + 1));
                values.set(i, res);
                values.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }

        double result = values.get(0);
        for (int i = 0; i < ops.size(); i++) {
            String op = ops.get(i);
            if (op.equals("+")) {
                result += values.get(i + 1);
            } else if (op.equals("-")) {
                result -= values.get(i + 1);
            }
        }
        return (int) Math.round(result);
    }
}
