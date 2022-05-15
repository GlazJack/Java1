package homework;

public class homework_17 {
    public static void main(String[] args) {

        //I задача
//        int[] array = new int[]{3, 5, 8, 1, 9, 2, 7, 4};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        for (int j = 0; j < array.length; j++) {
//
//            if (j % 2 != 0) {
//                array[j] = 0;
//            }
//            System.out.print(array[j] + " ");
//        }
//    }
//}


//II задача
//        int [] array1 = new int[]{2,5,3,1,4};
//        int [] array2 = new int[]{4,3,4,1,2};
//        int count = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//            sum1 += array1[i];
//            count++;
//            if (count == array1.length) {
//                sum1 /= array1.length;
//                System.out.printf("общее арифметическое %d",sum1);
//            }
//        }
//        System.out.println();
//        count = 0;
//        for (int j = 0; j < array2.length; j++){
//            System.out.print(array2[j] + " ");
//            sum2 += array2[j];
//            count++;
//            if (count == array2.length){
//                sum2 /= array2.length;
//                System.out.printf("общее арифметическое %d",sum2);
//            }
//        }
//        if (sum1 > sum2){
//            System.out.println("\nпервый массив больше второго");
//        }
//        else if (sum1<sum2){
//            System.out.println("\nвторой массив больше первого");
//        }
//        else {
//            System.out.println("\nмассивы равны");
//        }

//
//        III задача
        int[] Fibonachi = new int[10];
        int a = 0;
        int b = 1;
        int lenght_rows = 0;
        System.out.print(1 + " ");
        for (int i = 0; i <= Fibonachi.length; i++) {
            a += b;
            b += a;
            if (lenght_rows == 9) {
                System.out.println(a);
            } else if (lenght_rows > 9) {
                break;
            }
            System.out.print(a + " " + b + " ");
            lenght_rows += 1;

        }
    }
}

