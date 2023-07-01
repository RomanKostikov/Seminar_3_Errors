package classwork.task005;

public class ExceptionExample {
    // правильный вариант исполнения
    public static double divideNumbers(double a, double b) {
        try {
            double result = ((int)a / (int)b);
            return result;
        } catch (ArithmeticException e) {
            // Перехватываем исключение ArithmeticException
            // и обрабатываем его на текущем уровне абстракции
            System.out.println("Ошибка: Деление на ноль недопустимо");
            return Double.NaN; // Возвращаем NaN (Not a Number) в случае ошибки
        }
    }

    public static void performCalculation(double x, double y) {
        try {
            double result = divideNumbers(x, y);
            if (!Double.isNaN(result)) {
                // Обрабатываем результат вычисления
                System.out.println("Результат: " + result);
            }
        } catch (Exception e) {
            // Перехватываем исключение на более высоком уровне
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Вызываем метод performCalculation с разными аргументами
        performCalculation(10, 2);
        performCalculation(10, 0);
    }
}
