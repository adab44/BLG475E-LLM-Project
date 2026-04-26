/* @Authors
 * Student Names: Veysel Çelik
 * Student IDs: 150210702
 */


import java.util.*;
import java.lang.*;

class Solution {
    /**
    Evaluates polynomial with coefficients xs at point x.
    return xs[0] + xs[1] * x + xs[1] * x^2 + .... xs[n] * x^n
     */
    public double poly(List<Double> xs, double x) {
        double result = 0;
        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }
        return result;
    }
    
    /**
    xs are coefficients of a polynomial.
    findZero find x such that poly(x) = 0.
    findZero returns only only zero point, even if there are many.
    Moreover, findZero only takes list xs having even number of coefficients
    and largest non zero coefficient as it guarantees
    a solution.
    >>> findZero(Arrays.asList(1, 2)) // f(x) = 1 + 2x
    -0.5
    >>> findZero(Arrays.asList(-6, 11, -6, 1)) // (x - 1) * (x - 2) * (x - 3) = -6 + 11x - 6x^2 + x^3
    1.0
     */
    public double findZero(List<Double> xs) {
        double low = -1.0;
        double high = 1.0;

        // Step 1: Expand bounds until we find a sign change
        // Since it's an odd-degree polynomial, f(x) goes to infinity in one direction
        // and negative infinity in the other.
        while (poly(xs, low) * poly(xs, high) > 0) {
            low *= 2;
            high *= 2;
        }

        // Step 2: Bisection Method
        double epsilon = 1e-10; // Desired precision
        while (high - low > epsilon) {
            double mid = low + (high - low) / 2;
            if (poly(xs, low) * poly(xs, mid) <= 0) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (low + high) / 2;
    }
}