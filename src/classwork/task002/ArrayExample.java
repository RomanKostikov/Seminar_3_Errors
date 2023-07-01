package classwork.task002;

public class ArrayExample {
    // верный вариант использования отлавливания ошибки
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            int element = getElementAtIndex(array, 6);
            System.out.println("Значение элемента: " + element);
            System.out.println(2 + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за пределы массива");
        }
    }

    public static int getElementAtIndex(int[] array, int index) {
        return array[index];
    }
}
