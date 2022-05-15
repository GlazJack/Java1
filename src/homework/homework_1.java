package homework;

import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Имя пользователя: ");
        String name  = user.nextLine();
        System.out.println("Ваш возраст: ");
        int age  = user.nextInt();
        System.out.println("Ваш точный вес: ");
        float weight = user.nextFloat();
        System.out.println("Ваша точная зарплата? ");
        float salary = user.nextFloat();
        System.out.println("Вы состоите в браке? ");
        boolean status = user.nextBoolean();
        System.out.println("Сколько у Вас детей? ");
        byte children = user.nextByte();
        System.out.println("Как долго Вы живете в этом городе? ");
        float howLong = user.nextFloat();
        System.out.printf("добрый день меня зовут %s мне %d лет мой точный вес составляет %f моя точная зарплата" +
                "составляет в этом месяце %f брачный статус %b колличество детей %d проживаю в этом городе %f" +
                "",name,age,weight,salary,status,children,howLong);


    }
}
