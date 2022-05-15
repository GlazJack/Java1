package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {
        for (int g = 0; g < 10; g--) {
            try {
                Scanner cur = new Scanner(System.in);

                System.out.println("\nHello! This is a money convert. Please, input your amount of money in rubles:");
                double rub = cur.nextInt();
                System.out.println("Choose which currency to convert, where" +
                        "  \n1 - converting to dollars\n2 - converting to euros");
                int change = cur.nextInt();
                double doll = 75.16;
                double result1 = rub / doll;
                double euro = 90.61;
                double result2 = rub / euro;
                if (change == 1) {
                    System.out.println("You have chosen to convert to dollars");
                    System.out.printf("Your received amount in dollars: %.2f ", result1);
                } else if (change == 2) {
                    System.out.println("You have chosen to convert to euros");
                    System.out.printf("Your received amount in euros: %.2f", result2);
                }
                else{
                    System.out.println("please, input only 1 or 2");
                }
            } catch (ArrayIndexOutOfBoundsException a) {

                System.out.println("man,you input large number for our array!!:)\n");

            } catch (InputMismatchException i) {

                System.out.println("please, input only number\n");
            }catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("unknown error,please wright message from our support\n");
            }
        }
    }
}
