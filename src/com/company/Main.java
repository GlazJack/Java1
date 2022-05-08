package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //        System.out.println("Hello world");
//        byte num = 43;
//        int a = 45678;
//        float b = 345.45f;
//        double c = 56.1234567890987654d;
//        boolean isTrue = true;  // всего два значения - единица
//        boolean isFalse = false;  //значения ноль
//        char sym = 't';
//        String str = "Hello";
//        System.out.println(num);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(isTrue);
//        System.out.println(isFalse);
//        System.out.println(sym);
//        System.out.println(str);



//        Scanner num = new Scanner(System.in);
//        int first, second, result;
//        System.out.println("Enter first number: ");
//        first = num.nextInt();
//        System.out.println("Enter second number: ");
//        second = num.nextInt();
//        result = first + second;
//        result /=2;   //result = result/2; result ++; result--; result*=2; result+=2;
//        System.out.println("Result is:" + result);

//        Scanner num = new Scanner(System.in);
//        int first, second = 50;
//        boolean isTrue = true;
//        System.out.println("Enter first number: ");
//        first = num.nextInt();
//
//        isTrue = first == 51 ? true : false; //если first = 51 тогда ставим true
//        //иначе false
//
//        if (first>=second && isTrue ) {  //&& = и;   || = или;
//            System.out.println("Number is 10");
//            System.out.print("\n");}
//        else if (first == 45)
//            System.out.println(first + " is equal 45");
//         else{
//            System.out.println(first + " is lower than " + second);
//        }




//         switch (first){
//             case 51:
//                 System.out.println("Number is equal 51");
//                 break;
//             case 45:
//                 System.out.println("Number is equal 45");
//                 break;
//             case 67:
//                 System.out.println("Number is equal 67");
//                 break;
//             default:    //если ни один из case не выполненно, то возврашается ВУАФГДЕ
//                 System.out.println("Number is equal something");
//
//         }

//        for (int i = 100; i > 10; i-= 10){
//            System.out.println(i);
//        }
//
//        boolean q = true;
//        int j = 0;
//        while (j < 100){
//            j+=1;
//            if(j % 2 == 0)
//                continue;
//            System.out.println(j);
//
//        }
//        while (j < 20){
//            System.out.println(j);
//            j+=2;

//        while (q){
//            System.out.println(j);
//            j+=2;
//            if(j>10)
//                q = false;    //break;  return; continue;
//        }

//
//        while (j <= 100){
//            System.out.println(j);
//            j+=20;
//            if(j >= 80){
//                break;
//            }
//
//        }

//        int x = 13;
//        do {
//            x--;
//            System.out.println(x);
//        }while(x > 10);



//        int [] name;
//        name = new  int[5]; //int[] name = new int[5] {23,45,67];
//        name[1] = 23;
//        float [] name1;
//        name1 = new  float[5]; //float[] name = new int[5] {23.45f,45.67f,67.67f];
//        name1 [0] = 45.67f;
//        System.out.println(name[1]);


//        int [] a;
//        int n;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter numbers of array: ");
//        n = in.nextInt();
//        a = new int[n];
//        for(int i = 0; i < n; i++){
//            System.out.print("Enter a ["+ i +"] = ");
//            a[i] = in.nextInt();
//        }
//

        //Время
//        int a;
//        Scanner clock = new Scanner(System.in);
//        a = clock.nextInt();
//        int sec = a%60;
//        int min = a/60%60;
//        int hour = a/3600%24;
//        System.out.printf("%d" + ":" + "%02d" + ":" + "%02d",hour,min,sec );




        //многомерные массивы
//        char [][] array = new char [3][3] ;
//        array [0][0] = 'C';
//        System.out.print(array [0] [0]);
    }
}
