package ru.topacademy.lesson5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLength = 0;

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Необходимо ввести число!");
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
                break;
            }
        }

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Необходимо ввести число!");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                }
            }
        }

        numberUtils.sort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nВведите минимальный порог: ");
        int min = scanner.nextInt();

        int[] newArray = numberUtils.filter(min, array);
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}