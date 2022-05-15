package homework;

import java.util.Scanner;

public class homework_13 {
    //треугольник Паскаля
        public static void main(String[] args) {
            Scanner pas = new Scanner(System.in);
            int numb = pas.nextInt();
            int a, b;
            for (int i = 0; i <= numb; i++) {    //0,1,2,3
                a = 1;// здесь ты задаешь значение переменной а
                b = 1 + i;
                if (numb <= 5){
                    System.out.print("+");
                }
                else if (numb > 10){
                    System.out.print("-");
                }
                else{
                    System.out.print("=");
                }

                for (int j = numb; j > i; ) {//сделает 5 итераций когда i=0 , сделает 4 итерации при 1 = 1
                    //сделает 3 итерации при i = 2, выполнится два раза при i равным 3
                    System.out.print("  ");
                    j--;
                }
                for (int f = 0; f <= i; ) {// сработает 1 раз при i = 0, 2 раза при i = 1,
                    // 3 раза при i = 2
                    if (f > 0) {
                        a = a * (b - f) / f;//а = 1    формула выдает значения
                        if (a > 10) {
                            System.out.print("");
                        } else if (a < 1) {
                            System.out.print("");
                        }

                    }
                    System.out.print(a + "  ");
                    f++;
                }
                System.out.println();
            }
        }
    }
