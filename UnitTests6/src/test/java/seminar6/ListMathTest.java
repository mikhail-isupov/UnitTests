package seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования методов класса ListMath.
 */
class ListMathTest {
    // Список целых чисел для тестирования
    public static final Integer[] integerTestList = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Список вещественных чисел для тестирования
    public static final Double[] doubleTestList = {-0.9, -0.8, -0.7, -0.6, -0.5, -0.4, -0.3, -0.2, -0.1, 0.0,
            0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 10.0};
    //ожидаемое среднее списка
    public static final double testMean = 0.5;
    //Пустой список
    public static final List<Number> emptyList = new ArrayList<>();

    /**
     * Тестирование исключений, выбрасываемых методом ListMath.listMeanValue().
     */
    @Test
    public void listMeanValueExceptionsTest(){
        //Проверяем, что при попытке передать методу null выбрасывается заданное нами исключение
        // ListMath.nullPointerException
        assertThrows(ListMath.NULL_POINTER_EXCEPTION.getClass(), () -> {
            ListMath.listMeanValue(Arrays.asList(null));
        });
        //Проверяем, что при попытке передать методу пустой список выбрасывается заданное нами исключение
        // ListMath.emptyListException
        assertThrows(ListMath.EMPTY_LIST_EXCEPTION.getClass(), () -> {
            ListMath.listMeanValue(emptyList);
        });
    }

    /**
     * Тестирование работоспособности метода ListMath.listMeanValue()
     */
    @Test
    public void listMeanValueTest(){
        //Проверка того, что метод правильно рассчитывает среднее для списка целочисленных значений
        assertEquals(testMean, ListMath.listMeanValue(Arrays.asList(integerTestList)));
        //Проверка того, что метод правильно рассчитывает среднее для списка вещественных значений
        assertEquals(testMean, ListMath.listMeanValue(Arrays.asList(doubleTestList)));
    }
}