package homework;

public class homework_22 {
    public static void main(String[] args) {
        int [] numb1 = new int[] {0,1,2,3,4,5}; //
        int [] [] numb2 = {{0,1,2},{3,4,5}};
        System.out.println(numb2[1][2] );
        numb2[1][0]=44;
        System.out.println(numb2[1][0]);
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

                System.out.printf("%d ", nums[i][j]);//перебор
            }
            System.out.println();
        }
    }
}
