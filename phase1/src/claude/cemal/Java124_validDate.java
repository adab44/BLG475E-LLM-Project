
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

class Solution {
    boolean validDate(String date) {
        if (date == null || date.isEmpty()) {
            return false;
        }

        if (!date.matches("\\d{2}-\\d{2}-\\d{4}")) {
            return false;
        }

        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1) {
            return false;
        }

        if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(month)) {
            return day <= 31;
        } else if (Arrays.asList(4, 6, 9, 11).contains(month)) {
            return day <= 30;
        } else if (month == 2) {
            return day <= 29;
        }

        return false;
    }
}