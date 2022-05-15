package class_work;

public class lesson_18 {
    public static void main(String[] args) {
        lesson18_11 l =  new lesson18_11(123,"sdf","wer");
        l.display();
        Person p = new lesson18_11(78,"hgjk","vghj");
        p.display();
    }


}

class lesson18_11 extends Person{
    String team;

    lesson18_11(int a, String j, String team) {
        super(a, j);
        this.team = team;
    }

    @Override
    void display() {
        super.display();
        System.out.println("hello");
    }
}
