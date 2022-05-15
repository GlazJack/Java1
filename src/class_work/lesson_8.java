package class_work;

import java.util.Scanner;

public class lesson_8 {
    public static void main(String[] args) {
//        int number = 5;
//        int number2 = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("ввести число");
        int number  = in.nextInt();
        System.out.println("введите второе число");
        int number2 = in.nextInt();
        if (number>number2){
            if (number<10){
                System.out.println("первое число больше второго,меньше 10");
            }
            else {
                System.out.println("первое число больше второго,больше 10");
            }

        }
//        if (number>number2){
//            System.out.println("повторный блок if");
//        }
        else if (number<number2 || number<50){
            System.out.println("первое число меньше второго может быть меньше 50, а может и не быть");
        }
        else {
            System.out.println("числа равны");
        }
    }
}
