package homework;

import java.util.Scanner;

public class homework_11 {
    // тетрация
        public static void main(String[] args) {
            Scanner tet = new Scanner(System.in);
            System.out.println("Введите число");
            long a0 = tet.nextLong();
            for(int j = 1; j < 5; j++){
                a0 *= a0;
            }
            System.out.println(a0);
        }
}
