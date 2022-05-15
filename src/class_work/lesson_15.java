package class_work;

import java.util.Scanner;

public class lesson_15 {
    public static void main(String[] args) {
        Person evgenia  = new Person("Evgenia",18,"president");
        //evgenia.display();
        Person boris = new Person("Boris",18,"president");
        //boris.display();
        Person dima = new Person(18,"bugalter");
        dima.display();
    }
}
class Person{
    String name; // --------> состояние класса или поля класса
    int age; //---------> состояние класса или поля класса
    String job; //------> состояние класса или поля класса
    Scanner in;


    Person(String n, int a, String j){ // constructor
        this.name =  n;
        this.age = a;
        this.job = j;
    }
    Person(int a, String j){
        this.age = a;
        this.job = j;
    }
    void display(){// поведение класса
        if (this.name != null) {
            System.out.printf("name = %s,\nage = %d, \njob = %s\n", name, age, job);

        }
        else{
            in = new Scanner(System.in);
            System.out.println("input your name");
            String name = in.nextLine();
            System.out.printf("name = %s,\nage = %d, \njob = %s\n", name,age, job);
        }
    }
}
