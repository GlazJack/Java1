package homework;

import java.util.Scanner;

public class homework_9 {
    //Арифметическая прогрессия
        public static void main(String[] args) {
            Scanner progress = new Scanner(System.in);
            System.out.println("Введите первое значени: ");
            int a1 = progress.nextInt();
            System.out.println("Введите шаг: ");
            int a2 = progress.nextInt();
            System.out.println("Введите конечный элемент");//сколько раз будет повторяться
            int a3 = progress.nextInt();
            for (int i = a1; i <= a3; i += a2) {
                System.out.println(i);
            }
        }
    }

