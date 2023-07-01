package classwork.task001;

public class TryExample {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 20;
            int sum = x + y;
            System.out.println("Сумма: " + sum);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

//        System.out.println("x: " + x); // Ошибка: Недопустимая область видимости
//        System.out.println("y: " + y); // Ошибка: Недопустимая область видимости
//        System.out.println("sum: " + sum); // Ошибка: Недопустимая область видимости
    }
}
