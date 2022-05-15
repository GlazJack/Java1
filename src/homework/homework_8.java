package homework;

public class homework_8 {
    public static void main(String[] args) {

        int pop = 10_000_000;
        int a = 14;
        int b = 8;
        int birth = pop / 1000;
        int death = pop / 1000;
        for (int i = 0; i < 10; i++) {
            if (a >=7) {
                a--;
            }
            if (b >=6) {
                b--;
            }
            int rb = birth*a;
            int rd = death*b;
            int result =rb-rd;
            pop+=result;
        }
        System.out.printf("%d",pop);
    }
}
