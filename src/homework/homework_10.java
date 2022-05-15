package homework;

import java.util.Scanner;

public class homework_10 {
    //число Фибоначчи
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите длину ряда чисел: ");
            int length = in.nextInt();
            int count = 0;
            int count1 = 1;
            int length_rows = 1;
            System.out.print(0 + " " + 1 + " ");
            for (int i = 0; i < length; i++) {//1,2,3,4 - итерации
                count += count1;
                count1 += count;
                length_rows += 1; //длина строки 2,4,6,8
                if (length_rows < length) {
                    if (length % 2 == 0) { // четные числа
                        System.out.print(count + " " + count1 + " ");
                        length_rows += 1;// + одно значение (контролирует количество цифр в строке)
                    } else {
                        length_rows += 1;//3,5,7,9
                        if (length_rows < length) {
                            System.out.print(count + " " + count1 + " ");
                        } else if (length_rows == length) {
                            System.out.print(count);

                        }
                    }

                } else {

                    break;

                }
            }
        }
    }
