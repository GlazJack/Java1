package homework;

public class homework_16 {
    public static void main(String[] args) {
        //деление на 4
//        int [] array = new int[]{23,5,4,6,7,8,9,2};
//        int count = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i]==4){
//                count++;
//            }
//        }
//        System.out.print(count + " ");


        //237
//        int[] array = new int[]{1, 2, 3, 4, 237, 6, 7, 8, 9, 10};//создали массив
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                if (array[i] == 237) {
//                    break;
//                }
//                System.out.print(array[i] + " ");
//            }
//        }


        // полиндром
//        int [] a = new int[]{1,8,1};
//        int count = 0; //count = 1,2,3
//        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
//
////            for (int j = a.length - 1; j >= 0; j--) {// Iит j = 4-1; II ит j = 3-1 III ит j = 2-1 VI ит j = 1-1
//            if (a[i] == a[j]) {
//                count++;
//                if (count == a.length) {
//
//                    System.out.println("это полиндром");
//                }
//
//            }
//            else {
//                System.out.println("это не полиндром");
//                break;
//            }
//        }



//         вывести элементы первого массива, кот. не пересекаются со вторым
//        int[] a = new int[]{4, 21, 67, 8};
//        int[] b = new int[]{4, 2, 34, 8, 7};
//        int count;     //
//        for(int i = 0; i < a.length; i++) {//0,1, итерации
//            count = 0;//0,0
//            for(int j = 0; j < b.length; j++) {//5 итераций
//                if (a[i] == b[j]) {
//                    break;
//                }
//                else {
//                    count++;//1,2,3,4,5
//                    if (count == b.length) {
//                        System.out.print(a[i] + " ");
//                    }
//                }
//            }
//        }



//        элемент массива < 5
//        int [] numb = new int []{1,2,3,4,5};
//        for (int i = 0; i < numb.length; i++){
//            if (numb[i] < 5){
//                System.out.print(numb[i] + " ");
//            }
//        }

        //вернуть общие элементы двух массивов
//        int [] a = {1,22,5,6,87};
//        int[] b = {4,8,22,87,9};
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < b.length; j++){
//                if (a[i]==b[j]){
//                    System.out.print(a[i] + " ");
//
//                }
//            }
//        }

        //минимальное значение
        int[] array = new int[]{167, 123, 542, 43, 54, 65};
        int minValue = array[0]; //массив, куда записали минимальный элемент (value - значение)
        int minIndex = 0;//номер минимального элемента
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min Value: " + minValue );
        System.out.println("min Index: " + minIndex);



        //максимальное значение
//        int [] array = new int[]{35,89,115,1,1000,76,67,14};
//        int maxValue = array [0];
//        int maxIndex = 0;
//        for (int i = 1; i < array.length; i++){
//            if (array[i] > maxValue){
//                maxValue = array[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println("max Value: " + maxValue);
//        System.out.println("max Index: " + maxIndex);


        //Объединение массивов

        int[] numb1 = {6, 8, 9, 5};
        int[] numb2 = {5, 6, 3};
        int[] result = new int[numb1.length + numb2.length];//создаем новый массив. [количество ячеек 4 + 3]
        // в итоге получаем новый массив с 7 пустыми ячеками
        int count = 0; //счетчик, к кот. прибавляется единица от 0 до 7, тк у нас 7 ячеек
        for (int i = 0; i < numb1.length; i++) {//4 итерации
            result[i] = numb1[i];//при каждой итерации result[count++] присваивает значение numb2[j]
            // i = 0 res = 6; i = 1 res = 8 итд
            count++; //count = 1,2,3;
        }
        for (int j = 0; j < numb2.length; j++) {//3 итерации
            result[count++] = numb2[j];
        }//в result, уже лежит [6,8,9,5,0,0,0] и теперь нужно прибавить значения numb2. count = 4,5,6; это [5,6,3]
        //
        for (int i = 0; i < result.length; i++) {//count = 7;
            System.out.print(result[i] + " ");
        }
    }
}
