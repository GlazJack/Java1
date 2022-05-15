package homework;

public class homework_15 {
    public static void main(String[] args) {
//        int [] numb;// объявила массив
//        numb = new int[4]; //тут будут лежать числа
//        (обязательно нужно указывать сколько будет элементов в квадратных скобках)
        int [] numb = new int[4]; // 4 - это длина массива
        numb [20 - 18] = 50;//вместо второго нуля (элемента) подставится 50
        numb [0] = 3;
        numb [2] = 6;
        numb [3] = 7;
//    for (int i = 0; i < numb.length; i++){
//        System.out.println(numb [i]);//буду принтить каждый элемент массива по его индексу.
        // индекс числа в массиве всегда на один меньше его порядкого номера
//    }
        for (int i : numb) {
            System.out.println(i);

        }
    }
}
