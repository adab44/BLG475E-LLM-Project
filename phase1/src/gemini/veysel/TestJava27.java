/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */




import java.util.*;
import java.lang.*;

public class TestJava27 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.flipCase(""), ""),
                Objects.equals(s.flipCase("Hello!"), "hELLO!"),
                Objects.equals(s.flipCase("These violent delights have violent ends"), "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java27 flipCase - FAILED");
        } else {
            System.out.println("✅ Java27 flipCase - PASSED");
        }
    }
}