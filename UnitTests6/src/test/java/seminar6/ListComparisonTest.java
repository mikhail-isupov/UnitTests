package seminar6;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для проверки методов ListComparison.
 */
class ListComparisonTest {

    // Инициализация тестовых списков
    public static final Double[] firstTestList = {0.1, 0.2, 0.3, 0.4, 0.5};
    public static final Integer[] secondTestList = {1, 2, 3, 4, 5, 6};

    /**
     * Тестирование метода ListComparison.listComparison
     */
    @Test
    public void listComparisonTest(){
        //Проверяем, что в случае первое среднее > второго среднего выдается сообщение ListComparison.FIRST_IS_LARGE
        assertEquals(ListComparison.FIRST_IS_LARGE, ListComparison.listComparison(Arrays.asList(secondTestList), Arrays.asList(firstTestList)));
        //Проверяем, что в случае первое среднее < второго среднего выдается сообщение ListComparison.SECOND_IS_LARGE
        assertEquals(ListComparison.SECOND_IS_LARGE, ListComparison.listComparison(Arrays.asList(firstTestList), Arrays.asList(secondTestList)));
        //Проверяем, что в случае первое среднее == второе среднее выдается сообщение LListComparison.BORTH_ARE_EQUAL
        assertEquals(ListComparison.BORTH_ARE_EQUAL, ListComparison.listComparison(Arrays.asList(firstTestList), Arrays.asList(firstTestList)));
    }

}