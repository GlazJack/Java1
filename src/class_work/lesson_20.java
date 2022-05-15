package class_work;

public class lesson_20 {
    public static void main(String[] args) {
        home h = new home1(23,23);//upcasting
        home1 h1 = (home1) h;//downcasting *снизу вверх


    }
}
class home{
    private  int size;
    public home(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void display(){
        System.out.println(this.size);
    }
}
class home1 extends home{
    int count_badroom;
    home1(int size,int count_badroom){
        super(size);
        this.count_badroom = count_badroom;
    }


    void display1() {

        System.out.println("home1");
    }
}
class home2 extends home{
    int count_wc;
    public home2(int size,int count_wc) {
        super(size);
        this.count_wc = count_wc;
    }


    void display2() {

        System.out.println("home2");
    }
}
