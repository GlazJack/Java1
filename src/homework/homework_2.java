package homework;

import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number = task.nextInt();
        System.out.println("Введите второе число: ");
        int count  = task.nextInt();
        System.out.printf("%d+%d=%d\n",number,count,number+count);
        System.out.printf("%d-%d=%d\n",number,count,number-count);
        System.out.printf("%d*%d=%d\n",number,count,number*count);
        System.out.printf("%d/%d=%d\n",number,count,number/count);

    }
}
