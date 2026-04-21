/* @Authors
 * Student Names: Ada Berfu Kaynak
 * Student IDs: 820210314
 */
import java.util.*;
import java.lang.*;
class Solution {
    public boolean validDate(String date) {
        if (date == null || date.isEmpty()) return false;
        String[] parts = date.split("-");
        if (parts.length != 3 || parts[0].length() != 2 || parts[1].length() != 2 || parts[2].length() != 4) return false;
        try {
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            if (month < 1 || month > 12 || day < 1) return false;
            int[] maxDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return day <= maxDays[month];
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
