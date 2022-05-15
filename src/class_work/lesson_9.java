package class_work;

public class lesson_9 {
    public static void main(String[] args) {
//        for (int i =0; i<9; i++){
//            System.out.println(i);
//        }
//        for (int a = 0; a < 18; a++){
//            System.out.printf("квадрат числа %d = %d\n",a,a*a);
//        }
        int pop = 10_000_000;
        int life = 10_000_000/1000*14;
        int death = 10_000_000/1000*8;
        int year = life-death;
        for (int v = 0; v<10; v++){
            pop+=year;
            System.out.printf("%d\n",pop);
        }



    }
}
