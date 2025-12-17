package pl.alx.kalkulator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogikaKalkulatoraTest {
    private LogikaKalkulatora logika;

    @BeforeEach
    void setUp() {
        logika = new LogikaKalkulatora();
    }

    @Test
    void testPlus() {
        var result = logika.oblicz(12, 13, "+");
        assertEquals(25, result);
    }

    @Test
    void testMinus() {
        var result = logika.oblicz(20, 7, "-");
        assertEquals(13, result);
    }

    @Test
    void testMnoz() {
        var result = logika.oblicz(3, 7, "*");
        assertEquals(21, result);
    }

    @Test
    void testDziel() {
        var result = logika.oblicz(6, 2, "/");
        assertEquals(3, result);
    }
}
