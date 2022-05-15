package class_work;

public class lesson_16 {
    public static void main(String[] args) {
        Test  test  = new Test();
        System.out.println(test.getTest());
        test.setTest("test2");
        System.out.println(test.getTest());
    }
}
class Test{
    private String test = "test";

    public String getTest() { // getter

        return test;
    }
    public void setTest(String test) {//setter
        this.test = test;
    }
}
