package seminar6;

import java.util.List;

/**
 * Класс для сравнения двух списков.
 */
public class ListComparison {
    public static final String FIRST_IS_LARGE, SECOND_IS_LARGE, BORTH_ARE_EQUAL;
 
    static{
        FIRST_IS_LARGE = "Первый список имеет большее среднее значение";
        SECOND_IS_LARGE = "Второй список имеет большее среднее значение";
        BORTH_ARE_EQUAL =  "Средние значения равны";
    }

    /**
     * Метод для сравнения средних значений двух списков.
     * @param firstList - первый список чисел
     * @param secondList - второй список чисел
     * @return - результат сравнения средних значений двух списков
     */
    public static String listComparison(List<? extends Number> firstList, List<? extends Number> secondList){
        double firstMean = ListMath.listMeanValue(firstList);
        double secondMean = ListMath.listMeanValue(secondList);
        if (firstMean > secondMean) return FIRST_IS_LARGE;
        if (secondMean > firstMean) return SECOND_IS_LARGE;
        return BORTH_ARE_EQUAL;
    }
}
