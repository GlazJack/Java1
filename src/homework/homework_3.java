package homework;

import java.util.Scanner;

public class homework_3 {
    public static void main(String[] args) {
        Scanner card = new Scanner(System.in);
        System.out.println("Введите номер карты: ");
        long number = card.nextLong();// номер карты
        System.out.println("Введите ключ шифрования: ");
        long key = card.nextLong();//ключ
        long result = number^key;// XOR
        System.out.printf("Ваш номер карты в зашифрованном виде: %d\n",result);


    }
}
