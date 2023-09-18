import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
public class TestHomeWork3 {
    private HomeWork3 homework3;

    @BeforeEach
    private void init(){
        homework3 = new HomeWork3();
    }

    /**
     * Проверка определения четности числа
     */
    @Test
    void testEvenOddNumber(){
        assertTrue(homework3.evenOddNumber(2));
        assertFalse(homework3.evenOddNumber(1));
    }

    /**
     * Проверка определения принадлежности числа интервалу (25...100)
     */
    @Test
    void testNumeberInInterval(){
        assertFalse(homework3.numberInInterval(25));
        assertTrue(homework3.numberInInterval(26));
        assertTrue(homework3.numberInInterval(99));
        assertFalse(homework3.numberInInterval(100));
    }
}
