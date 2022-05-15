package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework_7 {
    public static void main(String[] args) {


        //проценты
//
        for (int g = 0; g < 10; g--) {
            try {
                Scanner count = new Scanner(System.in);
                for (int i = 1; i > 0; i++) { //запустили бесконечный цикл
                    System.out.println("Введите первое число: ");
                    long numb = count.nextLong();
                    System.out.println("Введите второе число");
                    long numb2 = count.nextLong();
                    System.out.printf("%d\n", numb * numb2);

                    System.out.println("Чтобы завершить цикл, нажмите 1");
                    int a = count.nextInt();
                    if (a == 1) {
                        System.out.println("Цикл завершен");
//                        break;//прерыв цикла, если a=1
                    } else {
                        System.out.println("ok guy let's continue");
                    }
                }
            } catch (InputMismatchException i) {
                System.out.println("please, input only number\n");
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("unknown error,please wright message from our support\n");
            }
        }
    }
}
