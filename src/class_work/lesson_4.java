package class_work;

import java.util.Scanner;

public class lesson_4 {
        public static void main(String[] args) {
//        System.out.println("Привет");
//        System.out.println("Привет мир");
//        System.out.print("доброе утро\n");
//        System.out.print("добрый вечер\n");
//        String name = "Женя";
//        int age = 18;
//        String city = "Москва";
//        System.out.printf("Привет, меня зовут %s мне %d лет, я живу в городе %s\n",name,age,city);
//        System.out.printf("Привет, меня зовут %s мне %d лет, я живу в городе %s",name,age,city);
            Scanner name = new Scanner(System.in);//создание объекта Scanner
            System.out.println("введите Ваше имя: ");//приглашение к вводу
            String correct = name.nextLine();//считывание строки
//        System.out.printf("привет меня зовут %s",correct);
            System.out.println("возраст: ");
            int age = name.nextInt();
            System.out.printf("привет меня зовут %s мне %d лет",correct,age);


        }
    }

