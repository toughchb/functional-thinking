package chapter01;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void word1Test() {
        Words words = new Words();
        Map map = words.wordFreq("i it in or is");
        map.keySet().stream().forEach(k -> System.out.println(map.get(k)));
    }
}
