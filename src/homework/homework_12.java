package homework;

import java.util.Scanner;

public class homework_12 {
    // Факториал
        public static void main(String[] args) {
            Scanner factorial = new Scanner(System.in);
            System.out.println("Введите число: ");
            int f = factorial.nextInt();
            int i;
            int result = 1;
            for (i = 1; i <= f; i++) {
                result *= i;
            }
            System.out.println(result);
        }
}
