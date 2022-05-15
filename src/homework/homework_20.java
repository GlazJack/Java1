package homework;

import java.util.Scanner;

public class homework_20 {
    public static void main(String[] args) {
        Animal jack = new Animal("Jack", "spire", "man", 5);
        jack.display();
//        System.out.println(jack.sex);
//        System.out.println(jack.name);
        Animal unknown = new Animal();
        unknown.say(unknown.name);

    }
}
class Animal {
    String name;
    String kind;
    String sex;
    int age;
    Scanner pet;

    Animal(String a, String q, String w, int e) {
        this.name = a;
        this.kind = q;
        this.sex = w;
        this.age = e;
    }
    Animal(){}

    void display() {
        System.out.printf("name of the pet -  %s \nkind  - %s \nsex - %s \nage - %d year(s) \n", name, kind, sex, age);
    }
    void say(String a){
        pet = new Scanner(System.in);
        System.out.println("Input the name of your pet");
        String name = pet.nextLine();
        System.out.print("hello" + " " + name);
    }
}
