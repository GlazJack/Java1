package homework;

import java.util.Scanner;

public class homework_21 {
    public static void main(String[] args) {
        Planet mars = new Planet("mars", 1200, 3.976);
        mars.display();
        Planet unknown = new Planet();
        unknown.display();
    }
}
class Planet{ //состояние класса/поля
    String name;
    int weight;
    double distance;
    Scanner plus;

    Planet(String a, int b, double c){//конструктор
        this.name = a;
        this.weight = b;
        this.distance = c;
    }
    Planet(){}

    void display(){ //поведение
        if (name != null) {
            System.out.printf("name of the planet is %s \nweight is %d kilogram \ndistance to %.3f miles", name, weight, distance);
        }
        else {
            plus = new Scanner(System.in);
            System.out.printf("please, input your own name of the planet, weight and distance to the planet\n");
            String name = plus.nextLine();
            int weight = plus.nextInt();
            double distance = plus.nextDouble();
            System.out.printf("your own name %s, \nweight is %d kilogram \ndistance is %.3f",name,weight,distance);
        }
        //переменные, кот записываются в классе принято называть полями
        //функции, кот записываются в классе принято называть методами
        //1. Обстракция
        //2. Полиморфизм
        //3. Итексуляция
        //4. Наследование
    }
}
