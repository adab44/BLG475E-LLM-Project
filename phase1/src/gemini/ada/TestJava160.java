import java.util.*;
import java.lang.*;
public class TestJava160 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.doAlgebra(new ArrayList<>(Arrays.asList("**", "*", "+")), new ArrayList<>(Arrays.asList(2, 3, 4, 5))) == 37,
                s.doAlgebra(new ArrayList<>(Arrays.asList("+", "*", "-")), new ArrayList<>(Arrays.asList(2, 3, 4, 5))) == 9,
                s.doAlgebra(new ArrayList<>(Arrays.asList("/", "*")), new ArrayList<>(Arrays.asList(7, 3, 4))) == 8,
                s.doAlgebra(new ArrayList<>(Arrays.asList("+")), new ArrayList<>(Arrays.asList(2, 3))) == 5,   // tek toplama
                s.doAlgebra(new ArrayList<>(Arrays.asList("-")), new ArrayList<>(Arrays.asList(5, 3))) == 2,   // tek çıkarma
                s.doAlgebra(new ArrayList<>(Arrays.asList("*")), new ArrayList<>(Arrays.asList(3, 4))) == 12,  // tek çarpma
                s.doAlgebra(new ArrayList<>(Arrays.asList("/")), new ArrayList<>(Arrays.asList(7, 3))) == 2,   // tek bölme
                s.doAlgebra(new ArrayList<>(Arrays.asList("**")), new ArrayList<>(Arrays.asList(2, 3))) == 8,  // tek üs alma
                s.doAlgebra(new ArrayList<>(Arrays.asList("+")), new ArrayList<>(Arrays.asList(0, 0))) == 0,  // sıfır operand
                s.doAlgebra(new ArrayList<>(Arrays.asList("/")), new ArrayList<>(Arrays.asList(7, 2))) == 3   // bölme kalanı var
        );
        if (correct.contains(false)) {
            System.out.println("❌ Java160 doAlgebra - FAILED");
        } else {
            System.out.println("✅ Java160 doAlgebra - PASSED");
        }
    }
}
