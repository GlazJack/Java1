package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework_6 {
    public static void main(String[] args) {
        for (int g = 0; g < 10; g--) {
            try {
                Scanner time = new Scanner(System.in);
                System.out.println("input the number of seconds");
                long sec = time.nextLong();
                long day = sec / 86400;
                long oct = sec % 86400;
                if (day == 1) {
                    System.out.println(day + " day");
                } else {
                    System.out.printf("%d days\n", day);
                }

                long hour = oct / 3600;
                long oct2 = oct % 3600;
                if (hour == 1) {
                    System.out.println(hour + "hour");
                } else {
                    System.out.printf("%d hours\n", hour);
                }
                long min = oct2 / 60;
                if (min == 1) {
                    System.out.println(min + "minuet");
                } else {
                    System.out.printf("%d minutes \n", min);
                }

                long oct3 = oct2 % 60;
                if (oct3 % 10 == 1) {
                    System.out.println(oct3 + " second");
                } else {
                    System.out.printf("%d seconds\n", oct3);
                }
            } catch (InputMismatchException i) {
                System.out.println("please, input only number\n");
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("unknown error,please wright message from our support\n");
            }
        }
    }
}
