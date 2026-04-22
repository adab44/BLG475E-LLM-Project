package gemini.cemal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class TestJava119 {
    Java119_matchParens s = new Java119_matchParens();

    @Test
    void testMatchParens() {
        // Cases that should return "Yes" (Correct matching)
        assertEquals("Yes", s.matchParens(Arrays.asList("()(", ")")), "Should be Yes because it can form ()()");
        
        // Cases that should return "No"
        assertEquals("No", s.matchParens(Arrays.asList(")", ")")), "Cannot be balanced");
        assertEquals("No", s.matchParens(Arrays.asList("(()))", "((()")), "Counts do not match");
        assertEquals("No", s.matchParens(Arrays.asList(")(", ")(")), "Directions are wrong");
    }
}
