/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public int multiply(int a, int b) {
        int lastDigitA = Math.abs(a % 10);
        int lastDigitB = Math.abs(b % 10);
        return lastDigitA * lastDigitB;
    }
}
