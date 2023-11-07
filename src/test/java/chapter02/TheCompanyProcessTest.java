package chapter02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class TheCompanyProcessTest {

    @Test
    void testProcess() {
        TheCompanyProcess process = new TheCompanyProcess();
        String result = process.cleanNames(List.of("friend", "test", "git"));
        assertThat(result).isEqualTo("Friend,Test,Git");
    }
}
