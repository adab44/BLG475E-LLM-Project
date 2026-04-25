import java.util.*;
import java.lang.*;
public class TestJava138 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.isEqualToSumEven(4) == false,
                s.isEqualToSumEven(6) == false,
                s.isEqualToSumEven(8) == true,
                s.isEqualToSumEven(10) == true,
                s.isEqualToSumEven(11) == false,
                s.isEqualToSumEven(12) == true,
                s.isEqualToSumEven(13) == false,
                s.isEqualToSumEven(16) == true,
                s.isEqualToSumEven(0) == false,   // sıfır girdi
                s.isEqualToSumEven(2) == false,   // küçük çift sayı
                s.isEqualToSumEven(-4) == false   // negatif sayı
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java138 isEqualToSumEven - FAILED");
        } else {
            System.out.println("✅ Java138 isEqualToSumEven - PASSED");
        }
    }
}
