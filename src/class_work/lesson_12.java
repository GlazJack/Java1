package class_work;

public class lesson_12 {
    public static void main(String[] args) {
//        System.out.println(sum(5,10));
//        System.out.println(sum(5));
        System.out.println(factorial(5));
    }
    static int factorial ( int x){
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);// recursive call
    }


//    static int sum(int a, int b) { // method overloading
//        return a + b;
//    }
//
//    static int sum(int a) {// method overloading
//        return a + 20;
//    }
//
//    static double sum(double a, double b) {// method overloading
//        return a + b;
//    }


    //стек           каждый вызов ждет выполнения от fac(5) до fac(1)
    // например fac(5) появился в стеке и сидит ждет выполнения fac(4) итд.
    // дошли до условия выхода и поднимаемся по цепочке наверх
    //24*fac(5)=120
    //6*fac(4)=24
    //2*fac(3)=6
    //1*fac(2)=2
    //fac(1)==return 1



}
