package class_work;

public class lesson_10 {
    public static void main(String[] args) {

        int [] [] numb = new int[2][5]; //двумерный массив
//        int [] numb1 = new int[]{1,2,3,4,5,6,7,8,9};//инициализировали массив без индексации
//        for (int i:numb1) {
//            System.out.println(i);
//        }
        int [][] numb1 = new int[][]{{0,1,2},{3,4,5}};//в первых скобках значение 1ой строки,
        // во вторых - второе значение
        for (int[] i:numb1) {
            for (int j: i){
                System.out.println(j); //определение двумерного массива
            }
        }
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println(); //перебор многомерных массивов через цикл
        }
        int j = 7;//цикл do
        do{
            System.out.println(j);
            j--;
        }
        while (j > 0);

//        int x = sum(1, 2, 3);
//        int y = sum(1, 4, 9);
//        System.out.println(x);  // 6
//        System.out.println(y);  // 14
//    }
//    static int sum(int a, int b, int c){
//
//        return a + b + c;
//    }
//}
    }
}
