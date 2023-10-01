package seminar6;

import java.util.List;

/**
 * Класс для математической обработки списка чисел.
 */

public class ListMath {
    public static final NullPointerException NULL_POINTER_EXCEPTION;
    public static final ArithmeticException EMPTY_LIST_EXCEPTION;

    static {
        NULL_POINTER_EXCEPTION = new NullPointerException("List should not be null.");
        EMPTY_LIST_EXCEPTION = new ArithmeticException("List should not be empty.");
    }

    /**
     * Метод для получения среднего значения списка чисел
     *
     * @param list - список чисел
     * @return среднее значение списка
     */
    public static double listMeanValue(List<? extends Number> list) {
        if (list == null) throw NULL_POINTER_EXCEPTION;
        if (list.isEmpty()) throw EMPTY_LIST_EXCEPTION;
        double sum = 0;
        for (Number value : list) {
            if (value instanceof Integer) {
                sum += (int) value;
            }
            if (value instanceof Double) {
                sum += (double) value;
            }
        }
        return sum / list.size();
    }

}
