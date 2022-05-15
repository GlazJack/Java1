package homework;

public class homework_18 {
    public static void main(String[] args) {
//        //вывести все числа от n до 1
        System.out.println(sum(7));
    }
    static int sum(int n) {
        //Базовый случай
        if (n == 1)//задали условия выхода
            return 1;//если n = 0, то верни единицу
        System.out.print(n + " ");
        //шаг рекурсии / рекурсивное условие
        return sum(n - 1);//с каждой рекурсией 7-1=6; 6-1=5; 5-1=4; итд.

        //факториал

//        System.out.println(someMethod(6));
//
//    }
//    static int someMethod(int a){
//        if (a == 1)
//            return 1;
//        return a * someMethod(a-1);

        //Дано натуральное число N.
        // Выведите слово YES, если число N является точной степенью двойки,
        // или слово NO в противном случае.

//        double a = someMethod(6);
//        if (someMethod(a)==1){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
//
//    }
//    static double someMethod(double a){
//        if (a == 1){
//            return 1;
//        }
//        if (a > 1 && a < 2) {
//            return a;
//        } else{
//            return someMethod(a/2);
//        }

        //число в обратном порядке
//
//        System.out.print(someMethod(567));
//    }
//    static int someMethod(int a){
//        if (a < 10) {//5 < 10 возвращаем 5
//            return a;
//        }else{
//            System.out.print(a % 10 + " ");//остаток 7,6
//            return someMethod(a/10);//567/10=56 56/10=5
//
//        }


    }
}
