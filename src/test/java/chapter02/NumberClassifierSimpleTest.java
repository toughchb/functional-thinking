package chapter02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class NumberClassifierSimpleTest {

    @Test
    void ImpNumberClassifierSimpleTest() {
        ImpNumberClassifierSimple numberClassifierSimple = new ImpNumberClassifierSimple(28);

        boolean perfect = numberClassifierSimple.isPerfect();

        boolean abundant = numberClassifierSimple.isAbundant();

        boolean deficient = numberClassifierSimple.isDeficient();

        assertThat(perfect).isTrue();
        assertThat(abundant).isFalse();
        assertThat(deficient).isFalse();
    }

    @Test
    void NumberClassifierSimple1Test() {
        boolean perfect = NumberClassifier.isPerfect(28);
        boolean abundant = NumberClassifier.isAbundant(28);
        boolean deficient = NumberClassifier.isDeficient(28);

        assertThat(perfect).isTrue();
        assertThat(abundant).isFalse();
        assertThat(deficient).isFalse();
    }

    @Test
    void NumberClassifierSimple2Test() {
        boolean perfect = NumberClassifier2.isPerfect(28);
        boolean abundant = NumberClassifier2.isAbundant(28);
        boolean deficient = NumberClassifier2.isDeficient(28);

        assertThat(perfect).isTrue();
        assertThat(abundant).isFalse();
        assertThat(deficient).isFalse();
    }
}
