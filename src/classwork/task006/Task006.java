package classwork.task006;

import java.util.Scanner;

public class Task006 {
    /*
     * Задача: Написать программу, которая запрашивает у пользователя два числа и выполняет деление первого числа на второе число.
     * В случае деления на ноль, необходимо выбросить пользовательское исключение DivisionByZeroException.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите число 2: ");
        double num2 = sc.nextDouble();
        try{
            if (num2 == 0) throw new DivisionByZeroException();
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, division(num1, num2));
        } catch (DivisionByZeroException e){
            System.out.println("Деление на ноль запрещено");
        }
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }
}
class DivisionByZeroException extends Exception{
    public DivisionByZeroException() {
        super();
    }
}
