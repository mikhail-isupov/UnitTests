public class HomeWork3 {

    /**
     * Метод, проверяющий, является ли число четным
     * @param n - число
     * @return - true (четное), false (нечетное)
     */
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * метод numberInInterval, который проверяет, попадает ли
     * переданное число в интервал (25;100)
     * @param n - число
     * @return true (попадает), false (нет)
     */
    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
