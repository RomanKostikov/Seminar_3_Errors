package classwork.task005;

public class ExceptionExample1 {
    // не правильный вариант исполнения
    public static double divideNumbers(double a, double b) {
        try {
            double result = ((int)a / (int)b);
            return result;
        } catch (Exception e) {
            // Перехватываем общее исключение Exception
            // и обрабатываем его на низком уровне абстракции
            System.out.println("Ошибка: " + e.getMessage());
            return 0; // Возвращаем некорректное значение в случае ошибки
        }
    }

    public static void performCalculation(double x, double y) {
        try {
            double result = divideNumbers(x, y);
            // Обрабатываем результат вычисления
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            // Перехватываем общее исключение Exception на том же уровне
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Вызываем метод performCalculation с разными аргументами
        performCalculation(10, 2);
        performCalculation(10, 0);
    }
}
