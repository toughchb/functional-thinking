package chapter02;

import java.util.stream.IntStream;

/***
 * java 8 자연수 분류기
 */
public class NumberClassifier2 {

    private static IntStream factorsOf(final int number) {
        return IntStream.range(1, number + 1)
                .filter(potential -> number % potential == 0);
    }

    private static int aliquotSum(int number) {
        return factorsOf(number).sum() - number;
    }

    public static boolean isPerfect(final int number) {
        return aliquotSum(number) == number;
    }

    public static boolean isAbundant(final int number) {
        return aliquotSum(number) > number;
    }

    public static boolean isDeficient(final int number) {
        return aliquotSum(number) < number;
    }
}
