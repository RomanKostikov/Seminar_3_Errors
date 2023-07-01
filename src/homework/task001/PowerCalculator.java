package homework.task001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    /*
    Напишите программу-калькулятор, которая запрашивает у пользователя два числа
    и выполняет операцию возведения первого числа в степень второго числа.
    Если введены некорректные числа или происходит деление на ноль, необходимо обработать
    соответствующие исключения и вывести информативное сообщение об ошибке.
    Важно! С использованием принципа одного уровня абстракции!
    **В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
    выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль)
    и отрицательная степень, выбрасывается исключение InvalidInputException. В методе main() мы
    запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower() и
    выводим результат. Если введены некорректные числа или происходит ошибка ввода,
    соответствующие исключения перехватываются и выводится информативное сообщение об ошибке.
    Обратите внимание, что в этой задаче мы использовали собственное исключение
    InvalidInputException, чтобы явно указать на некорректный ввод. Это помогает разделить
    обработку ошибок на соответствующие уровни абстракции.**
     */
    public static double inputNum() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static double calculatePower(double num1, double num2) throws InvalidInputException {
        if (num1 == 0) throw new InvalidInputException("Основание не должно быть равным нулю!");
        if (num2 < 0) throw new InvalidInputException("Показатель степени не может быть отрицательным!");
        return Math.pow(num1, num2);
    }


    public static void main(String[] args) {
        try {
            System.out.print("Введите основание: ");
            double num1 = inputNum();
            System.out.print("Введите степень: ");
            double num2 = inputNum();
            double result = calculatePower(num1, num2);
            System.out.printf("%.2f ^ %.2f = %.2f", num1, num2, result);
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод!");
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
