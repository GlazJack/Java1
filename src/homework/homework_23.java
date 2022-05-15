package homework;

public class homework_23 {
    public static void main(String[] args) {
        Animal121 jack = new Animal121();
        Animal121 tom = new Animal121();

        jack.displayId();
        tom.displayId();

        System.out.println(Animal121.counter);

        //изменение Id
        Animal121.counter = 67;
        Animal121 animal = new Animal121();
        animal.displayId();

    }
}
class Animal121{
    private int id;
    static int counter = 1;

    Animal121(){
        id = counter++;
    }

    public void displayId(){
        System.out.printf("Id: %d\n",id);
    }
}

