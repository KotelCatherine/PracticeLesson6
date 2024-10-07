package ru.topacademy.lesson5;

/**
 * Задача 0: Сортировка и фильтрация(c классом)
 * <p>
 * Описание: Создайте класс NumberUtils, который будет содержать
 * методы для работы с массивами чисел. Реализуйте метод,
 * который будет сортировать массив и метод,
 * который будет фильтровать элементы массива,
 * оставляя только те, которые больше заданного порога.
 * <p>
 * Требования:
 * 1. Реализуйте метод sort, который принимает массив целых чисел и возвращает
 * отсортированный массив. Используйте алгоритм сортировки
 * (например, сортировку пузырьком или выбором) и циклы.
 * 2. Реализуйте перегруженный метод filter, который принимает массив
 * целых чисел и пороговое значение. Метод должен возвращать новый массив,
 * содержащий только те числа, которые больше порога.
 * 3. В главном методе реализуйте функционал для ввода массива чисел от
 * пользователя, а также порога фильтрации. Обработайте неверные вводы с помощью ветвлений.
 */
public class NumberUtils {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int change = array[i];
                array[i] = array[i + 1];
                array[i + 1] = change;
            }
        }
        return array;
    }

    public int[] filter(int[] array, int min) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }

    public int[] filter(int min, int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }
}
