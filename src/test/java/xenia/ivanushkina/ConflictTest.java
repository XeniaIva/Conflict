package xenia.ivanushkina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConflictTest {
    String a = "Hello, world!";

    @Test
    void conflictTest() {
        Assertions.assertEquals(a,"Hello, world!");
    }
}
