package class_work;

import java.util.Scanner;

public class lesson_11 {
    public static void main(String[] args) { // main method
        //test();//вызвали метод "test"
        //test2(30,"Evgenia");//обязана передать аргуенты в круглых скобках
        //test3(new int[]{1,2,3});//это все называется возовом метода

    }


    static void test(){ // method
        int [] numb = new int[4];
        numb [20 - 18] = 50;
        numb [0] = 3;
        numb [2] = 6;
        numb [3] = 7;
        for (int i : numb) {
            System.out.println(i);

        }
    }
    static void test2(int a, String n){//parameters - это то что в скобках
        Scanner in = new Scanner(System.in);
        System.out.println("2 string:");
        n = in.nextLine();
        System.out.println("1 number: ");
        a = in.nextInt();
        System.out.println(a+" "+n);

    }

    static void test3(int [] t){
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }
    static int itai(int i){//если тип данных метода String, то return должен обязательно возвращать String
        return i;

    }
}
