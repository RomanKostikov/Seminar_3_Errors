package classwork.task006;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    // код от препадователя
    public static double divideNumbers(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите первое число: ");
            double b = getInputNumber("Введите второе число: ");

            double result = divideNumbers(a, b);
            System.out.println("Результат деления: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное число");
        } catch (DivisionByZeroException e) {
            handleDivisionByZeroException(e);
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void handleDivisionByZeroException(DivisionByZeroException e) {
        System.out.println("Ошибка: " + e.getMessage());
        // Дополнительная обработка исключения на более высоком уровне абстракции
        // Например, запись лога, уведомление пользователя или выбор альтернативного пути выполнения программы
        // ...
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}
