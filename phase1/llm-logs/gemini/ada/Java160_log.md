# Log - Java/160 - doAlgebra
**LLM:** Gemini
**Date:** 2026-04-22

## Prompt Sent:
import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given two lists operator, and operand. The first list has basic algebra operations, and
    the second list is a list of integers. Use the two given lists to build the algebric
    expression and return the evaluation of this expression.
    The basic algebra operations:
    Addition ( + )
    Subtraction ( - )
    Multiplication ( * )
    Floor division ( / )
    Exponentiation ( ** )
    Example:
    operator["+", "*", "-"]
    array = [2, 3, 4, 5]
    result = 2 + 3 * 4 - 5
    => result = 9
    Note:
        The length of operator list is equal to the length of operand list minus one.
        Operand is a list of of non-negative integers.
        Operator list has at least one operator, and operand list has at least two operands.
     */
    public int doAlgebra(List<String> operator, List<Integer> operand) {

## Agent Response:
import java.util.*;
class Solution {
    public int doAlgebra(List<String> operator, List<Integer> operand) {
        List<Double> values = new ArrayList<>();
        for (int num : operand) values.add((double) num);
        List<String> ops = new ArrayList<>(operator);
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("**")) {
                double res = Math.pow(values.get(i), values.get(i + 1));
                values.set(i, res);
                values.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            String op = ops.get(i);
            if (op.equals("*") || op.equals("/")) {
                double res = op.equals("*") ? values.get(i) * values.get(i + 1) : Math.floor(values.get(i) / values.get(i + 1));
                values.set(i, res);
                values.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        double result = values.get(0);
        for (int i = 0; i < ops.size(); i++) {
            String op = ops.get(i);
            if (op.equals("+")) result += values.get(i + 1);
            else if (op.equals("-")) result -= values.get(i + 1);
        }
        return (int) Math.round(result);
    }
}

## Notes:
Original HumanEval prompt used without modification. Code used without modification. Base test FAILED - ** operator applied left to right instead of right to left.
