package classwork.task002;

public class ArrayExample1 {
    public static void main(String[] args) {
        // не верный вариант использования отлавливания ошибки(код продолжает работу при срабатывании ошибки)
        int[] array = {1, 2, 3, 4, 5};

        int element = getElementAtIndex(array, 6);
        System.out.println("Значение элемента: " + element);
        System.out.println(2 + element);
    }

    public static int getElementAtIndex(int[] array, int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за пределы массива");
        }
        return 1;
    }
}
