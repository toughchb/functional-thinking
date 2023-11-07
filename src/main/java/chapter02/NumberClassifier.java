package chapter02;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NumberClassifier {

    private static boolean isFactor(final int candidate, final int number) {
        return number % candidate == 0;
    }

    private static Set<Integer> factors(final int number) {
        Set<Integer> factors = new HashSet<>();
        factors.add(1);
        factors.add(number);
        for (int i = 2; i < number; i++) {
            if (isFactor(i, number)) {
                factors.add(i);
            }
        }
        return factors;
    }

    private static int aliquotSum(final Collection<Integer> factors) {
        int sum = 0;
        int targetNumber = Collections.max(factors);
        for (int n : factors) {
            sum += n;
        }
        return sum - targetNumber;
    }

    public static boolean isPerfect(final int number) {
        return aliquotSum(factors(number)) == number;
    }

    public static boolean isAbundant(final int number) {
        return aliquotSum(factors(number)) > number;
    }

    public static boolean isDeficient(final int number) {
        return aliquotSum(factors(number)) < number;
    }
}
