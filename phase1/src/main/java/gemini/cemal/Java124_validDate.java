package gemini.cemal;
/* @Authors
 * Student Names: Cemal Yılmaz
 * Student IDs: 820210317
 */
import java.util.*;
import java.lang.*;

public class Java124_validDate {
    public boolean validDate(String date) {
        try {
            date = date.strip();
            String[] dates = date.split("-" );
            if (dates.length != 3) return false;
            String m = dates[0];
            while (!m.isEmpty() && m.charAt(0) == '0') {
                m = m.substring(1);
            }
            if (m.isEmpty()) m = "0";
            String d = dates[1];
            while (!d.isEmpty() && d.charAt(0) == '0') {
                d = d.substring(1);
            }
            if (d.isEmpty()) d = "0";
            String y = dates[2];
            while (!y.isEmpty() && y.charAt(0) == '0') {
                y = y.substring(1);
            }
            if (y.isEmpty()) y = "0";
            
            int month = Integer.parseInt(m), day = Integer.parseInt(d), year = Integer.parseInt(y);
            if (month < 1 || month > 12) {
                return false;
            }
            if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(month) && (day < 1 || day > 31)) {
                return false;
            }
            if (Arrays.asList(4, 6, 9, 11).contains(month) && (day < 1 || day > 30)) {
                return false;
            }
            if (month == 2 && (day < 1 || day > 29)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
