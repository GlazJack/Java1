package class_work;

public class lesson_19 {
    public static void main(String[] args) {
        Fabric1 fabric1 = new Fabric1();
        fabric1.shiesh();
    }
}


abstract class mainFabric{
    String material;
    public abstract void shiesh();
}

class Fabric1 extends mainFabric{

    @Override
    public void shiesh() {
        System.out.println("fabric1");
    }
}
class Fabric2 extends mainFabric{

    @Override
    public void shiesh() {

    }
}
