package homework;

public class Main {
    public static void main(String[] args){
        Person vitya = new Person(120, "Vitya");
        System.out.println(vitya.name + "\'s height is " + vitya.height);
        vitya.say("George");
        System.out.println(vitya.height);
        Person vlad = new Person();
        System.out.println(vlad.height);
        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");
        Student freshman = new Student(56, "Victor", 2);
        freshman.tell();

    }
}

