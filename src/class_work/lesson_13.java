package class_work;

import java.util.Scanner;

public class lesson_13 {
    public static void main(String[] args) {
        // work with error
        for (int g = 0; g<10;g--){
            try {
                Scanner test = new Scanner(System.in);
                System.out.println("input number");
                int t = test.nextInt();
                int[] array = new int[5];
                array[t] = 45;// runtime error
                System.out.println(array[t]);
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println("man,you input large number for our array!!:)\n");
            }

        }
    }
}
