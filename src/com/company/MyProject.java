package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyProject {
        public static void main(String[] args) {
            for (int i = 0; i < 1; i--) {
                try {
                    Scanner full = new Scanner(System.in);
                    System.out.println("Hello! This is Math Game! Would you like to star?\n" +
                            "If you want to select mathematical models -  press 1\n" +
                            "If you want to select Arrays - press 2 \n" +
                            "If you want to leave the Game - press 3 \n");
                    byte a = full.nextByte();
                    if (a == 3) {
                        System.out.println("Game over");
                        break;
                    } else if (a == 1) {
                        for (int i1 = 0; i1 < 1; i1--) {
                            Scanner full1 = new Scanner(System.in);
                            System.out.print("Ok guy, you choose math models.\n" +
                                    "What do you want to deal with?\n" +
                                    "click 1 if want a factorial\n" +
                                    "click 2 if want a  Fibonacci\n" +
                                    "click 3 if want a currency\n" +
                                    "click 4 if want seconds in day\n" +
                                    "click 5 if want a percent\n" +
                                    "click 6 if want numbers\n" +
                                    "click 7 if want an arithmetic progression\n" +
                                    "click 8 if want a titration\n" +
                                    "click 0 return back\n");
                            byte b = full1.nextByte();
                            if (b == 0) {
                                break;
                            } else if (b == 1) {
                                System.out.println("You chose a Factorial.");
                                factorial();
                            } else if (b == 2) {
                                System.out.println("You chose a Fibonacci");
                                fibonacci();
                            } else if (b == 3) {
                                System.out.println("You chose a currency");
                                currency();
                            } else if (b == 4) {
                                System.out.println("You chose a seconds");
                                secondsInDay();
                            } else if (b == 5) {
                                System.out.println("You chose a percent");
                                percent();
                            } else if (b == 6) {
                                System.out.println("You chose numbers");
                                numbers();
                            } else if (b == 7) {
                                System.out.println("You chose an arithmetic progress ");
                                arifProg();
                            } else if (b == 8) {
                                System.out.println("You chose a titration");
                                titration();
                            } else {
                                System.out.println("Please input the number from 0 to 8");
                            }
                        }
                    } else if (a == 2) {
                        for (int i1 = 0; i1 < 1; i1--) {
                            Scanner full1 = new Scanner(System.in);

                            System.out.println("Fine! you choose Arrays" +
                                    "\nclick 1 if it's an arrays" +
                                    "\nclick 2 if it's a maxArray" +
                                    "\nclick 3 if it's a minArrays" +
                                    "\nclick 4 if it's a returnArrays" +
                                    "\nclick 5 if it's an array1 not array2" +
                                    "\nclick 6 if it's a palindrome" +
                                    "\nclick 7 if it's an array not 237" +
                                    "\nclick 8 if it's a division" +
                                    "\nclick 9 if it's an odd index" +
                                    "\nclick 10 if it's a compare arrays" +
                                    "\nclick 11 if it's an array more 5 " +
                                    "\nclick 0 return back");
                            byte b = full1.nextByte();
                            if (b == 0) {
                                break;
                            } else if (b == 1) {
                                arrays();
                            } else if (b == 2) {
                                maxArray();
                            } else if (b == 3) {
                                minArray();
                            } else if (b == 4) {
                                returnArray1();
                            } else if (b == 5) {
                                array1NotArray2();
                            } else if (b == 6) {
                                palindrome();
                            } else if (b == 7) {
                                arrayNot237();
                            } else if (b == 8) {
                                lookingFor4();
                            } else if (b == 9) {
                                oddIndex();
                            } else if (b == 10) {
                                compareArrays();
                            } else if (b == 11) {
                                arrayMore5();
                            } else {
                                System.out.println("Please, input tne number from 0 to 10");
                            }

                        }
                    } else {
                        System.out.println("Input only 1, 2 or 3");
                    }
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("man, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static boolean choose() {
            Scanner s = new Scanner(System.in);
            System.out.println("\nWould you like to Finish? Yes - put 1  No - put 2");
            byte t = s.nextByte();
            if (t == 1) {
                System.out.println("Finished");
                return false;

            } else if (t == 2) {
                System.out.println("Ok, let's go again");
                return true;

            } else {
                System.out.println("Please, input 1 or 2");
                return true;
            }
        }

        static void fibonacci() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Input the length of numbers: ");
                    int length = in.nextInt();
                    int length_rows = 1;
                    System.out.print(0 + " " + 1 + " ");
                    int count = 0;
                    int count1 = 1;
                    for (int i = 0; i < length; i++) {//1,2,3,4 - итерации
                        count += count1;
                        count1 += count;
                        length_rows += 1; //длина строки 2,4,6,8
                        if (length_rows < length) {
                            if (length % 2 == 0) { // четные числа
                                System.out.print(count + " " + count1 + " ");
                                length_rows += 1;// + одно значение (контролирует количество цифр в строке)
                            } else {
                                length_rows += 1;//3,5,7,9
                                if (length_rows < length) {
                                    System.out.print(count + " " + count1 + " ");
                                } else if (length_rows == length) {
                                    System.out.print(count);
                                }
                            }
                        }

                    }
                    boolean c = choose();
                    if ( c == true) {
                        continue;
                    } else {
                        break;
                    }
                } catch (InputMismatchException i) {
                    System.out.println("man, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }


        static void currency() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner cur = new Scanner(System.in);
                    System.out.println("Hello! This is money convert. Please, input your amount of money in rubles:");
                    double rub = cur.nextInt();
                    System.out.println("Choose which currency to convert, where" +
                            "  \n1 - converting to dollars\n2 - converting to euros");
                    int change = cur.nextInt();
                    double result1 = rub / 75.16;
                    double result2 = rub / 90.61;
                    if (change == 1) {
                        System.out.println("You have chosen to convert to dollars");
                        System.out.printf("Your received amount in dollars: %.2f ", result1);
                    } else if (change == 2) {
                        System.out.println("You have chosen to convert to euros");
                        System.out.printf("Your received amount in euros: %.2f", result2);
                    } else {
                        System.out.println("Please, input only 1 or 2");
                    }
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }

                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }


        static void secondsInDay() {
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
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }
                } catch (InputMismatchException i) {
                    System.out.println("Hey, guy! input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }


        static void percent() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner bank = new Scanner(System.in);
                    System.out.println("Input the deposit amount: ");
                    float money = bank.nextFloat();
                    System.out.println("Input the term of the deposit in months: ");
                    long month = bank.nextLong();
                    for (int i = 0; i < month; i++) {
                        double procent = money * 0.07;
                        money += procent;
                    }
                    System.out.printf("After %d months, the deposit amount will be %.2f", month, money);
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }


                } catch (InputMismatchException i) {
                    System.out.println("Please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }


        static void numbers() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner count = new Scanner(System.in);
                    System.out.println("Input the first number: ");
                    long numb = count.nextLong();
                    System.out.println("Input the second number:");
                    long numb2 = count.nextLong();
                    System.out.printf("%d\n", numb * numb2);
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }

                } catch (InputMismatchException i) {
                    System.out.println("input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }


        static void arifProg() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner progress = new Scanner(System.in);
                    System.out.println("Input the first number: ");
                    int a1 = progress.nextInt();
                    System.out.println("Input the step:  ");
                    int a2 = progress.nextInt();
                    System.out.println("Input the last element");
                    int a3 = progress.nextInt();
                    for (int i = a1; i <= a3; i += a2) {
                        System.out.println(i);
                    }
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }

                } catch (InputMismatchException i) {
                    System.out.println("Please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }

        }

        static void titration() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner tet = new Scanner(System.in);
                    System.out.println("Input the number: ");
                    long a0 = tet.nextLong();
                    for (int j = 1; j < 5; j++) {
                        a0 *= a0;
                    }
                    System.out.println(a0);
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }
                } catch (InputMismatchException i) {
                    System.out.println("man, input only number)\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }

        }

        static void factorial() {

            for (int g = 0; g < 10; g--) {
                try {
                    Scanner factorial = new Scanner(System.in);
                    System.out.println("Input the number: ");
                    int f = factorial.nextInt();
                    int result = 1;
                    for (int i = 1; i <= f; i++) {
                        result *= i;
                    }
                    System.out.println(result);
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }


        static void Pascal() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner Pas = new Scanner(System.in);
                    System.out.println("Input the number: ");
                    int numb = Pas.nextInt();
                    int a, b;
                    for (int i = 0; i <= numb; i++) {    //0,1,2,3
                        a = 1;
                        b = 1 + i;
                        System.out.print(" ");
                        for (int j = numb; j > i; ) {
                            System.out.print(" ");
                            j--;

                        }
                        for (int f = 0; f <= i; ) {
                            if (f > 0) {
                                a = a * (b - f) / f;
                                if (a < 10) {
                                    System.out.print(" ");
                                } else if (a < 100 && a > 10) {
                                    System.out.print("  ");
                                }
                            }
                            System.out.print(a + " ");
                            f++;
                        }
                        System.out.println();
                    }

                } catch (InputMismatchException i) {
                    System.out.println("input incorrect data, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void arrays() {
            for (int g = 0; g < 10; g--) {
                try {
                    int count = 0;
                    int[] result;
                    int[] array;
                    int[] array2;
                    int num;
                    int num2;
                    Scanner input = new Scanner(System.in);
                    System.out.println("In this game we will combine two arrays.\n " +
                            "so how many numbers you wanna in the first array?");
                    num = input.nextInt();
                    array = new int[num];
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Enter" + " " + i + " " + "number of the first array");
                        array[i] = input.nextInt();
                    }
                    System.out.println("How many numbers you wanna in the second array?");
                    num2 = input.nextInt();
                    array2 = new int[num2];
                    for (int j = 0; j < array2.length; j++) {
                        System.out.println("Enter" + " " + j + " " + "number of the second array");
                        array2[j] = input.nextInt();
                    }

                    result = new int[array.length + array2.length];
                    for (int i = 0; i < array.length; i++) {
                        result[i] = array[i];
                        count++;
                    }
                    for (int j = 0; j < array2.length; j++) {
                        result[count++] = array2[j];
                    }
                    for (int i = 0; i < result.length; i++) {
                        System.out.print(result[i] + " ");
                    }

                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }

        }


        static void maxArray() {
            for (int g = 0; g < 10; g--) {
                try {
                    int[] array;
                    int numb;
                    Scanner input = new Scanner(System.in);
                    System.out.println("How long of the array you would like?: ");
                    numb = input.nextInt();
                    array = new int[numb];
                    for (int j = 0; j < array.length; j++) {
                        System.out.print("Input the" + " " + j + " " + "number of the array: ");
                        array[j] = input.nextInt();
                    }
                    int maxValue = array[0];
                    int maxIndex = 0;
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] > maxValue) {
                            maxValue = array[i];
                            maxIndex = i;
                        }
                    }
                    System.out.println("max Value: " + maxValue);
                    System.out.println("max Index: " + maxIndex);
                    boolean c = choose();
                    if (c == true) {
                        continue;
                    } else {
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }



        static void minArray() {
            for (int g = 0; g < 10; g--) {
                try {
                    int[] array;
                    int numb;
                    Scanner input = new Scanner(System.in);
                    System.out.println("How long array you would like?");
                    numb = input.nextInt();
                    array = new int[numb];
                    System.out.println("Enter" + " " + numb + " " + "numbers of your array");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Input " + " " + i + " " + "number");
                        array[i] = input.nextInt();
                    }
                    int minValue = array[0];
                    int minIndex = 0;
                    for (int j = 0; j < array.length; j++) {
                        if (array[j] < minValue) {
                            minValue = array[j];
                            minIndex = j;
                        }
                        System.out.println("min Value: " + minValue);
                        System.out.println("min Index: " + minIndex);
                        boolean c = choose();
                        if (c == true) {
                            continue;
                        } else {
                            break;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("You input large number for our array\n");
                } catch (InputMismatchException i) {
                    System.out.println("Please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("Unknown error,please wright message from our support\n");
                }
            }
        }

        static void returnArray1() {
            for (int g = 0; g < 10; g--) {
                try {
                    int [] array1;
                    int [] array2;
                    int numb1;
                    int numb2;
                    Scanner input = new Scanner(System.in);
                    System.out.println("Input the numbers of the first array");
                    numb1 = input.nextInt();
                    array1 = new int[numb1];
                    for (int i = 0; i < array1.length; i++) {
                        System.out.println("Enter" + " " + i + " " + "number of the second array");
                        array1[i] = input.nextInt();
                    }
                    System.out.println("Input the numbers of the second array");
                    numb2 = input.nextInt();
                    array2 = new int[numb2];
                    for (int i = 0; i < array2.length; i++) {
                        System.out.println("Enter" + " " + i + " " + "number of the second array");
                        array2[i] = input.nextInt();
                    }
                    for (int i = 0; i < array1.length; i++) {
                        for (int j = 0; j < array2.length; j++) {
                            if (array1[i] == array2[j]) {
                                System.out.println("number" + " " + array1[i] + " " + "the common number of the 2 arrays");
                            }
                        }
                    }
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                }
                catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void arrayMore5() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("How many numbers do you want to enter?");
                    byte a = input.nextByte();
                    System.out.print("Enter the" + " " + a + " " + "numbers\n");
                    int[] numb = new int[a];
                    for (int i = 0; i < numb.length; i++) {
                        numb[i] = input.nextByte();
                        if (numb[i] < 5) {
                            System.out.print(numb[i] + " " + "less then 5\n");
                        } else if (numb[i] == 5) {
                            System.out.print(numb[i] + " " + "numbers are equal\n");
                        } else {
                            System.out.print(numb[i] + " " + "more than 5\n");
                        }
                    }
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                }
                catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void array1NotArray2() {
            for (int g = 0; g < 10; g--) {
                try {
                    int count;
                    int [] array1;
                    int [] array2;
                    int numb1;
                    int numb2;
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("How many numbers do you want to enter to the first array?");
                    numb1 = input1.nextInt();
                    array1 = new int[numb1];
                    for (int i = 1; i <= numb1; i++){
                        System.out.println("Enter" + " " + i + " " + "number ");
                        array1[i] = input1.nextInt();
                    }
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("How many numbers do you want to enter to the second array?");
                    numb2 = input2.nextInt();
                    array2 = new int[numb2];
                    for (int j = 1; j <= numb2; j++){
                        System.out.println("Enter" + " " + j + " " + "number of the second array");
                        array1[j] = input2.nextInt();
                    }

                    for (int i = 0; i < array1.length; i++) {//0,1, итерации
                        array1[i] = input1.nextInt();
                        count = 0;//0,0
                        for (int j = 0; j < array2.length; j++) {//5 итераций
                            array2[j] = input2.nextInt();
                            if (array1[i] == array2[j]) {
                                break;
                            } else {
                                count++;//1,2,3,4,5
                                if (count == array2.length) {
                                    System.out.print(array1[i] + " ");
                                }
                            }
                        }
                    }
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void palindrome() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("In this point of game we'll make sure\n" +
                            "is your array a palindrome\n" +
                            "Let's go\n" +
                            "How many numbers of the array you would like?\n");
                    int numb = input.nextByte();
                    int[] a = new int[numb];
                    int count = 0;
                    for (int f = 0; f < a.length; f++){
                        System.out.println("Ok, enter" + " " + f + " " + "numbers of your array");
                        a[f] = input.nextInt();
                    }
                    for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
                        if (a[i] == a[j]) {
                            count++;
                            if (count == a.length) {
                                System.out.println("This is a palindrome");
                            }

                        } else {
                            System.out.println("This isn't a palindrome");
                            break;
                        }
                    }
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                }
                catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void arrayNot237() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Now we are looking for even numbers in your array" +
                            "\nBut know if there is a number 237 I will miss it" +
                            "\nLet's go" +
                            "\nHow many numbers of the array you would like?");
                    int numb = input.nextByte();
                    System.out.print("Ok, enter" + " " + numb + " " + "numbers of your array\n");
                    int[] array = new int[numb];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = input.nextInt();
                        if (array[i] % 2 == 0) {
                            if (array[i] == 237) {
                                break;
                            }
                            System.out.print(array[i] + " ");
                        }
                    }
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void lookingFor4() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner f = new Scanner(System.in);
                    System.out.println("In this point of game we are looking for the number 4 in your array" +
                            "\nlet's go" +
                            "\nHow many numbers of the array you would like?");
                    int l = f.nextInt();
                    System.out.print("Ok, enter" + " " + l + " " + "numbers of your array\n");
                    int[] array = new int[l];
                    int count = 0;
                    for (int i = 0; i < array.length; i++) {
                        array[i] = f.nextInt();
                        if (array[i] == 4) {
                            count++;
                        }
                    }
                    System.out.print("In your array" + " " + count + " " + "numbers of the 4\n");
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                }catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void oddIndex() {
            for (int g = 0; g < 10; g--) {
                try {
                    Scanner d = new Scanner(System.in);
                    System.out.println("The point of the game:" +
                            "\n1. you need to enter the number of the array" +
                            "\n2. in the result your array will be number 0 of your even index" +
                            "\nlet's go" +
                            "\nHow many numbers of the array you would like? ");
                    int numb = d.nextInt();
                    System.out.println("Ok, enter" + " " + numb + " " + "numbers of your array");
                    int[] array = new int[numb];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = d.nextInt();
                        System.out.print(array[i] + " ");

                    }
                    System.out.println("it's your array");
                    for (int j = 0; j < array.length; j++) {
                        if (j % 2 != 0) {
                            array[j] = 0;
                        }
                        System.out.print(array[j] + " ");
                    }
                    System.out.println("the modified array");
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                }catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }

        static void compareArrays() {
            for (int g = 0; g < 10; g--) {
                try {
                    int sum1 = 0;
                    int sum2 = 0;
                    int count;
                    int numb1;
                    int numb2;
                    int [] array1;
                    int [] array2;
                    Scanner input = new Scanner(System.in);
                    System.out.println("In this game you enter two arrays\n" +
                            "I calculate the arithmetic value of each your array\n" +
                            "And as a result I will show which the array is larger\n" +
                            "let's go!\n" +
                            "How many numbers of the array you would like?\n");
                    numb1 = input.nextInt();
                    array1 = new int[numb1];
                    for (int i = 0; i < array1.length; i++) {
                        System.out.println("Ok, enter" + " " + i + " " + "numbers of the first array");
                        array1[i] = input.nextInt();
                    }
                    System.out.println("How many numbers of the second array you would like?");
                    numb2 = input.nextInt();
                    array2 = new int[numb2];
                    for (int j = 0; j < array2.length; j++){
                        System.out.println("Ok, enter" + " " + j + " " + "numbers of the second array");
                        array2[j] = input.nextInt();
                    }
                    for (int i = 0; i < array1.length; i++) {
                        count = 0;
                        sum1 += array1[i];
                        count++;
                        if (count == array1.length) {
                            sum1 /= array1.length;
                            System.out.printf("general arithmetic %d of the first array\n", sum1);
                        }
                    }
                    System.out.println();
                    for (int j = 0; j < array2.length; j++) {
                        count = 0;
                        sum2 += array2[j];
                        count++;
                        if (count == array2.length) {
                            sum2 /= array2.length;
                            System.out.printf("general arithmetic %d of the second array\n", sum2);
                        }
                    }

                    if (sum1 > sum2) {
                        System.out.println("The first array is lager than the second\n");
                    } else if (sum1 < sum2) {
                        System.out.println("The second array is larger than the first\n");
                    } else {
                        System.out.println("The arrays are equal\n");
                    }
                    boolean c = choose();
                    if (c == true){
                        continue;
                    }
                    else{
                        break;
                    }
                }catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("man,you input large number for our array!!:)\n");
                } catch (InputMismatchException i) {
                    System.out.println("please, input only number\n");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("unknown error,please wright message from our support\n");
                }
            }
        }
    }
