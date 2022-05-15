package class_work;

public class lesson_21 {
    public static void main(String[] args) {
        Printtable printtable = new Test1();

    }
}
interface Printtable{
    void print();
    static void read(){
        System.out.println("dcjabscdk");
    }
    default void print3(){
        System.out.println("asdc");
    }
}

interface Printable2{
    private int test111(){
        System.out.println();
        return 1;
    }
    void print2();
}

class  Test1 implements Printtable,Printable2{

    @Override
    public void print() {
        System.out.println("ajn;jdcns");
    }

    @Override
    public void print2() {

    }
}
